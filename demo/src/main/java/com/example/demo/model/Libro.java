package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="titulo")
    private String titulo;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="cantidadPaginas")
    private int cantidadPaginas;

    public Libro() {
    }

    public Libro(String titulo, String descripcion, int cantidadPaginas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.cantidadPaginas = cantidadPaginas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }
}
