# app-prueba

App de prueba para el ambiente a utilizar en el curso

El objetivo es lograr levantar el proyecto y ver en el navegador el mensaje del index.html

http://localhost:8080/app-prueba

Hola mundo cruel !!!


## Maven

mvn clean para borrar los archivos generados

mvn compile para compilar el proyecto

maven package para empaquetar el código compilado en el distributable (jar, war, etc.)


## Plugin de wildfly

mvn wildfly:run -> levanta el server y hace el deploy de la app

mvn wildfly:deploy -> hacer el deploy de la app
mvn wildfly:redeploy -> para hacer redeploy
mvn wildfly:undeploy -> para hacer undeploy


## Ejecutar app

para ejecutar la app desde la linea de comando:

mvn clean package wildfly:run
 