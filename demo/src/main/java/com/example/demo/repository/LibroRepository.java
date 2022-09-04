package com.example.demo.repository;

import com.example.demo.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}
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