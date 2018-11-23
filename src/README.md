# Bedbug
Bedbug Staging is currently holding test code.  Mostly Java Spring Maven files.  Should create an authorization server locally that allows for user authentication.

# Lakehead Bedbug

Lakehead Bedbug is currently has all the files on the test public url http://lakeheadbedbug.hopto.org
This demonstrates sucessfully OAuth2 Authorization Grant Code.
## Build Process

None as itS just HTML, CSS and Javascript.  Also the tokens and requests need to be hosted on specific registered domains.  This is currently running on lighttpd on a linux router.
# Bedbug Staging ui

This is Oauth 2 with Java under a virual token bearer Authorization.  Users still login directly through Google/Lakehead myino however the RMS system handles tokens.  This increases scope and duration of the authentication.

## Build Process

To create instance of OAuth locally :

•	Any decent Java IDE should work

•	Recommend JDK 8 latest update – this is the most widely used JDK and is still fully supported.

o	Make sure PATH is configured properly so you can run java javac and jars from command line

•	Maven – Plugin for your IDE or installed locally if possible so that command line and PATH can run mvn or mvn.exe commands

•	Tomcat – plugin for IDE installed – should not require configuration as Maven and Spring handle this

•	VS Code plugins : (This is what I’ve been using...it’s fast and works)

o	Java Pack - https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack

o	Tomcat - https://marketplace.visualstudio.com/items?itemName=adashen.vscode-tomcat 

o	Spring Boot - https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-spring-boot 

o	Spring Init - https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-spring-initializr 

o	Optional – Checkstyle for Java - https://marketplace.visualstudio.com/items?itemName=shengchen.vscode-checkstyle 




STEPS

•	Sync GitHub and Pull. Import project into IDE – Use this folder directly of copy it somewhere locally 
\Repos\Bedbug\src\BedbugStaging\ui 

•	Depending on IDE being used these may differ slightly

o	Ensure local project configuration supports use of package as defined ‘com.bedbug ‘

o	Make sure Spring Project is initialized 

o	You may need to build using maven on first run – Some IDEs will do this automatically, some won’t.

o	Run or Debug main from SocialApplication.java

o	Wait for any build tasks then view on localhost:8080

test by logging clicking login and you should see Google login

•	Some possible tips on Google API using Java –

o	https://github.com/googleapis/google-api-java-client 

o	https://developers.google.com/identity/sign-in/web/backend-auth 

