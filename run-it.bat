copy Dockerfile target
pause
mvn package
pause
step1.bat
pause
step2.bat
pause
curl http://localhost:8080/01-0.0.1-SNAPSHOT/rest/message/
pause
