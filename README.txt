PRUEBA JAVA AZURIAN

Nombre: Rodrigo Vásquez

A continuación, mi proyecto de desarrollo para la prueba, la cual nos muestra una lista
de las carreras de la Fórmula 1 y sus corredores del 2022-2021

Backend (alojado en el puerto 8080): El backend fue desarrollado en springboot e integrando JPA. 
IMPORTANTE: en main/java/resources/application.properties definir adecuadamente los campos
######
spring.datasource.url=jdbc:postgresql://localhost:5432/f1
spring.datasource.username=postgres
spring.datasource.password=a
#####
Nombre BD :f1
Nombre de usuario en PGAdmin
Password que hayan definido al instalar PGAdmin



Base de datos: postgreSQL y PGAdmin
Crear una base de datos en postgres PGAdmin4 
Nombre BD: f1
Para crear tablas: bd_scripts/create_tables.sql
Para insertar datos: bd_scripts/copy.sql O Insertar el bd_scripts/sprint_results.csv desde PGAdmin4 (Al importar el csv desde PGAdmin deben considerar que la id es de tipo SERIAL y no esta en el archivo csv)

Una vez importado el CSV nuestra BD esta lista!


Frontend en Angular(alojado en el puerto 4200): 

En un cmd ejecutar los siguientes comandos

npm install -g @angular/cli
ng new my-app
cd my-app
ng serve --open

Ejecucion de pruebas: ng test




Saludos!
