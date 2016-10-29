Forked & edited for the ParseWorkshop
# Parse-Platform
This is a fork of https://github.com/instainer/parse-server-docker, all the original features are included, but additional features are:

- Up to date parse server (at this time of writing 2.2.17)
- Dashboard included (server + dashboard in same image)
- Optional MongoDB support (ignore this if you want to run the builtin version)

The main advantages over the original version is ease-of-use, higher out-of-the-box factor and saves space and memory if you already run a MongoDB instance (since you can reuse that one)

## Variables
Environment variables and default values for parse-server;

- APP_ID myAppId
- MASTER_KEY mySecretMasterKey
- FILE_KEY optionalFileKey
- USER_NAME user
- PASSWORD pass
- SERVER_URL http://localhost:8080

## Running

With builtin MongoDB:

`docker run -d -t -i -p 1500:8080 -p 1501:4040 --name parse peterwilli/parse-platform`

With custom (existing MongoDB):

`docker run -d -t -i -p 1500:8080 -p 1501:4040 -e MONGO_URL='MY_MONGO_URL' --name parse peterwilli/parse-platform`

With a Docker linked MongoDB instance (this is my setup)

 - Fire up a docker mongodb instance, like this one: `docker run --name db -d mongo` if you haven't done already.
 - run the parse instance like so: `docker run -d -t -i -e MONGO_URL='mongodb://db:27017/parse' -p 1500:8080 -p 1501:4040 --link db:db --name parse parse`

When all is done, you should have your dashboard at `http://localhost:1501` and your parse API at `http://localhost:1500`
