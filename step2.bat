cd target
docker build --tag=docker-app .
docker run -it --expose=8080 -p 8080:8080  docker-app
