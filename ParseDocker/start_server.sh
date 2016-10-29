#!/bin/sh
if [ -z "$MONGO_URL" ]; then
	export MONGO_URL='mongodb://localhost:27017/dev'
	echo "No Mongo URL set, auto-making one..."
	/usr/bin/mongod --config /etc/mongodb.conf &
fi
cd /usr/src/app
npm start &
bash start_dashboard.sh
