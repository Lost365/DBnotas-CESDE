Proyecto: Notas Definitivas
Descripción
Aplicación backend desarrollada en Java con Spring Boot para gestionar estudiantes y sus notas. Permite registrar estudiantes, calcular promedio y mostrar su estado académico.
Estado del proyecto
Proyecto finalizado y funcional. Listo para pruebas y entrega académica.
Tecnologías utilizadas
- Java 17
- Spring Boot
- SQL Server
- JDBC Driver manual
- IDE: Visual Studio Code
Instalación y ejecución
- Configura la base de datos DBNotas en SQL Server.
- Asegúrate de que el puerto 1433 esté habilitado y el firewall permita conexiones.
- Verifica que el usuario tenga permisos (db_owner, VIEW SERVER STATE).
- Ajusta el archivo application.properties:
- 
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=DBNotas;trustServerCertificate=true;
spring.datasource.username=castrillon
spring.datasource.password=castrillon
spring.jpa.hibernate.ddl-auto=update


- Ejecuta el proyecto desde tu IDE con Spring Boot configurado.
Errores conocidos
- Error de conexión si el puerto está bloqueado → Solución: abrir puerto 1433 en firewall.
- Error 4064 → Solución: cambiar base predeterminada del usuario a master.
- Error 229 → Solución: otorgar permiso VIEW SERVER STATE.


Preguntas frecuentes
¿Se crean las tablas automáticamente?
Sí, con ddl-auto=update y permisos correctos.
¿Se puede probar sin frontend?
Sí, el proyecto incluye lógica en consola con CommandLineRunner.
Licencia
Uso académico. No se permite distribución comercial sin autorización.
Autor
Sebastián Castrillón – Desarrollo backend, conexión a base de datos, pruebas y documentación.
