PRUEBA JAVA AZURIAN

Nombre: Rodrigo Vásquez

A continuación, mi proyecto de desarrollo para la prueba, la cual nos muestra una lista
de las carreras de la Fórmula 1 y sus corredores del 2022-2021

Backend (puerto 8080): El backend fue desarrollado en springboot e integrando JPA. 
IMPORTANTE: en main/java/resources/application.properties definir adecuadamente los campos
######
spring.datasource.url=jdbc:postgresql://localhost:5432/f1
spring.datasource.username=postgres
spring.datasource.password=a
#####
es decir la BD tiene que tener de nombre "f1" o bien cambiarlo respectivamente en el application.properties
username el nombre de usuario de su BD
y la password que hayan definido.



Base de datos: Para la base de datos ocupe postgreSQL y PGAdmin, el archivo "create_tables"
nos trae el script que crea las tablas, luego tenemos el archivo copy el cual trae el comando 
COPY que asigna los valores del CSV a la base de datos. En mi caso importé el archivo CSV desde pgadmin, puesto que con el comando COPY me arrojaba un tipo de error por permisos.

Una vez importado el CSV nuestra BD esta lista!


Frontend(puerto 4200): Para el frontend ocupé angular, puesto que era la tecnología más moderna que estaba mencionada en los ejemplos de la prueba.

En un cmd ejecutar los siguientes comandos

npm install -g @angular/cli
ng new my-app
cd my-app
ng serve --open

luego de esto el frontend debe estar corriendo!
y para ejecutar las pruebas en angular el comando es "ng test"

Muchas gracias por su tiempo
Saludos!