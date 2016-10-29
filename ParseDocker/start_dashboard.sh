#!/bin/bash
read -d '' config <<EOF
{
  "users": [
    {
      "user":"$USER_NAME",
      "pass":"$PASSWORD"
    }
  ],
  "apps": [
    {
      "serverURL": "$SERVER_URL/parse",
      "appId": "$APP_ID",
      "masterKey": "$MASTER_KEY",
      "appName": "My Parse Server App"
    }
  ]
}
EOF
echo "Config file:\n$config"
echo $config > /var/parse-dashboard-config.json

parse-dashboard --allowInsecureHTTP=1 --config /var/parse-dashboard-config.json
