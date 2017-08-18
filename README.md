# java-web-app
Example of Java EE webapp

To test SSO:

```javascript

var app = new fin.desktop.Application({uuid:'abc', name:'abc', url:'http://localhost:8080/sso?username=openfin', autoShow:true, contextMenu:true})
app.run();

```

Any other username should show login page.

