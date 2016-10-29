var _ = require('underscore');


Parse.Cloud.beforeSave("Task", function (request, response) {
    request.object.set("data", _.escape(request.object.get("data")));
    if (request.user) {
        request.object.set("user", request.user);
    }
    response.success();
});


Parse.Cloud.define("func", function (request, response) {
    response.success("Hello from test");
});

Parse.Cloud.job("jobx", function (request, status) {
    status.message("I just started");
    setTimeout(function (result) {
        status.success("I just finished");
    }, 5000);

});