# RESTAPI---POSTMAN-&H2 Database
USED SPRING WEB ,DEV TOOLS,LOMBOK,MYSQL DRIVER ,WEBSTARTER
RESTAPI OF CRUD OPERATIONS
api tested by  postman 
![image](https://github.com/user-attachments/assets/ee8a9b5b-469d-4f1c-843a-4c324545c28a)
![Screenshot (138)](https://github.com/user-attachments/assets/ffbc54d3-30b8-409a-9ae7-5c132010d5ff)


H2 Embedded Database -- it is a  Temporary Database .gives default server 
add h2 database dependency in pom.xml 
also the application.properties as  
spring.application.name=H2Database
spring.datasource.url=jdbc:h2:mem:AZ;
#spring.datasource.url=jdbc:h2:file:/C:/Users/ASUS/Documents/docs/myh2database
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=sa
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
![image](https://github.com/user-attachments/assets/e19b133c-dd4f-47a3-a87b-62198e9c7c0e)

Swagger-ui 
add this dependencies 
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>
![image](https://github.com/user-attachments/assets/34c72f34-85cc-4766-b32c-861c75965b07)
![image](https://github.com/user-attachments/assets/4221cef6-ebb8-4759-aa31-3587fdf96e57)

