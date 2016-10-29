var express = require('express');
var ParseServer = require('parse-server').ParseServer;

var app = express();

// Specify the connection string for your mongodb database
// and the location to your Parse cloud code
var api = new ParseServer({
  databaseURI: process.env.MONGO_URL,
  cloud: '/usr/src/app/parse-server/cloud/main.js', // Provide an absolute path
  appId: process.env.APP_ID,
  masterKey: process.env.MASTER_KEY,
  fileKey: process.env.FILE_KEY,
  serverURL: process.env.SERVER_URL,
  dotNetKey: process.env.DOTNET_KEY,
  clientKey: process.env.CLIENT_KEY ,
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
  allowClientClassCreation: process.env.CLIENT_CLASS_CREATION || false
});

// Serve the Parse API on the /parse URL prefix
app.use('/parse', api);

// Hello world
app.get('/', function(req, res) {
  res.status(200).send('Express is running here. Check /parse directory for magic :)');
});

var port = process.env.PORT || 8080;
app.listen(port, function() {
  console.log('parse-server running on port ' + port + '. APP_ID ' + process.env.APP_ID);
});