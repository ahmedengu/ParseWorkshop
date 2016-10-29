var express = require('express');
var ParseServer = require('parse-server').ParseServer;
var path = require('path');
var ParseDashboard = require('parse-dashboard');
var Twig = require("twig");

var app = express();
app.set("twig options", {
    strict_variables: false
});
app.use('/public', express.static(path.join(__dirname, '/public')));

var api = new ParseServer({
    databaseURI: 'mongodb://localhost:27017/data',
    cloud: __dirname + '/cloud/main.js',
    appId:  'myAppId',
    clientKey: "myClientKey",
    masterKey: 'mySecretMasterKey',
    serverURL: 'http://localhost:1337', 
    liveQuery: {
        classNames: ["Task"] 
    },
    websocketTimeout: 10 * 1000,
    cacheTimeout: 60 * 600 * 1000,
    logLevel: 'VERBOSE',
    revokeSessionOnPasswordReset: true,
    accountLockout: {
        duration: 5,
        threshold: 3
    }
    ,
    filesAdapter: {
        module: "parse-server-fs-adapter",
        options: {
            filesSubDirectory: ""
        }
    },
	  allowClientClassCreation:  true
});


var mountPath = process.env.PARSE_MOUNT || '/parse';
app.use(mountPath, api);

app.get('/', function (req, res) {
    res.status(200).send('I dream of being a website.  Please star the parse-server repo on GitHub!');
});

app.get('/view', function (req, res) {
    res.render('index.twig', { title: 'Hey', message: 'Hello there!'});
});

var dashboard = new ParseDashboard({
    "apps": [
        {
            "serverURL": "http://localhost:1337/parse",
            "appId": "myAppId",
            "masterKey": "mySecretMasterKey",
            "appName": "MyApp"
        }
    ], "users": [
        {
            "user": "admin",
            "pass": "123456789"
        }
    ]
}, true);
app.use('/dashboard', dashboard);


var port = process.env.PORT || 1337;
var httpServer = require('http').createServer(app);
httpServer.listen(port, function () {
    console.log('parse-server running on port ' + port + '.');
});

ParseServer.createLiveQueryServer(httpServer);

