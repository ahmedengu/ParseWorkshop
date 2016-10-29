var _ = require('underscore');


Parse.Cloud.beforeSave("Task", function (request, response) {
    request.object.set("data", _.escape(request.object.get("data")));
    if (request.user) {
           request.object.set("user", request.user);
    }
    response.success();
});
