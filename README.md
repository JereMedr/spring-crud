# spring-crud
## desafio tecnico
######  Algunas notas del crud de libros
1. Este repositorio no cuenta con una base de datos embebida, deberas entrar al properties y poner las propiedades que correspondan para conectarlo a una base de datos.
2. Se uso una base de datos MYSQL
3. el script de la creacion de la tabla libros esta comentado en **libroRepository.java**
```
 /*CREATE TABLE demodatabase.libros (
	id_libro INT auto_increment NOT NULL,
	titulo varchar(100) NOT NULL,
	descripcion varchar(100) NULL,
	CONSTRAINT libros_PK PRIMARY KEY (id_libro)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci
AUTO_INCREMENT=1;*/
```
