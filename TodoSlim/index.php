<?php
use Parse\ParseClient;
use Parse\ParseObject;
use Parse\ParseQuery;
use Parse\ParseACL;
use Parse\ParsePush;
use Parse\ParseSessionStorage;
use Parse\ParseUser;
use Parse\ParseInstallation;
use Parse\ParseException;
use Parse\ParseAnalytics;
use Parse\ParseFile;
use Parse\ParseCloud;

require __DIR__ . '/vendor/autoload.php';
session_start();
ParseClient::initialize('myAppId', 'myClientKey', 'mySecretMasterKey');
ParseClient::setServerURL('http://docker19107-env-2854709.mircloud.host', 'parse');
ParseClient::setStorage(new ParseSessionStorage());

$app = new Slim\App();
$container = $app->getContainer();
$container['view'] = function ($container) {
    $view = new \Slim\Views\Twig('view', [
        'cache' => false
    ]);
    $basePath = rtrim(str_ireplace('index.php', '', $container['request']->getUri()->getBasePath()), '/');
    $view->addExtension(new Slim\Views\TwigExtension($container['router'], $basePath));
    return $view;
};


$app->get('/', function ($request, $response) {
    if (ParseUser::getCurrentUser() != null)
        return $response->withRedirect('/todo');
    else
        return $this->view->render($response, 'index.html');
});

$app->post('/login', function ($request, $response, $args) {
    $data = $request->getParsedBody();
    try {
        $user = ParseUser::logIn($data['username'], $data['password']);

        $response = $response->withRedirect('/todo');
    } catch (ParseException $ex) {
        $response = $ex->getMessage();
    }

    return $response;
});

$app->post('/signup', function ($request, $response, $args) {
    $data = $request->getParsedBody();
    $user = new ParseUser();
    $user->setUsername($data['username']);
    $user->setPassword($data['password']);
    try {
        $user->signUp();

        $response = $response->withRedirect('/todo');
    } catch (ParseException $ex) {
        $response = $ex->getMessage();
    }
    return $response;
});

$app->get('/logout', function ($request, $response, $args) {
    ParseUser::logOut();
    return $response->withRedirect('/');
});

$app->get('/todo', function ($request, $response, $args) {
    $user = ParseUser::getCurrentUser();
    if ($user == null)
        return $response->withRedirect('/');
    $query = new ParseQuery("Task");
    $query->equalTo("user", $user);
    $tasks = $query->find();

    return $this->view->render($response, 'todo.html', ['tasks' => $tasks]);
});

$app->get('/check/{id}', function ($request, $response, $args) {
    $id = $request->getAttribute('id');
    $task = new ParseObject("Task", $id);
    $task->set("checked", true);
    $task->save();

    return $response->withRedirect('/todo');
});

$app->get('/uncheck/{id}', function ($request, $response, $args) {
    $id = $request->getAttribute('id');
    $task = new ParseObject("Task", $id);
    $task->set("checked", false);
    $task->save();

    return $response->withRedirect('/todo');
});

$app->get('/remove/{id}', function ($request, $response, $args) {
    $id = $request->getAttribute('id');
    $task = new ParseObject("Task", $id);
    $task->destroy();
    return $response->withRedirect('/todo');
});

$app->post('/add', function ($request, $response, $args) {
    $data = $request->getParsedBody();
    $gameScore = new ParseObject("Task");

    $gameScore->set("checked", false);
    $gameScore->set("user", ParseUser::getCurrentUser());
    $gameScore->set("data", $data['taskData']);

    try {
        $gameScore->save();
        $response = $response->withRedirect('/todo');
    } catch (ParseException $ex) {
        $response = $ex->getMessage();
    }

    return $response;
});
$app->run();
