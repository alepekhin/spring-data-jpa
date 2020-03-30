# spring-data-jpa
Spring-data JPA example with MySql

# How to run

- run mysql database as
````
sh start-mysql-server.sh
```

- check IP address in mysql.sh
- fill database as
```
sh mysql.sh
mysql> source init-data.sh
mysql> exit
```
- check IP address in application.properties
- start application
```
mvn spring-boot:run
```
- open browser at
```
http://localhost:8080/swagger-ui.html
``` 


