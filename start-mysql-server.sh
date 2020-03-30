#run mysql server
docker stop test-mysql
docker rm test-mysql
docker run --detach --name=test-mysql --env="MYSQL_ROOT_PASSWORD=mypassword" mysql

#find IPAddress
docker inspect test-mysql | grep \"IPAddress\"

echo Use this address for access to database

