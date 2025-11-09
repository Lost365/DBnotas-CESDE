package com.notas.notasdefinitivas.Model;

import jakarta.persistence.*;

@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante() {}

    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

   
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }
    public double getNota3() { return nota3; }

    public void setId(Long id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNota1(double nota1) { this.nota1 = nota1; }
    public void setNota2(double nota2) { this.nota2 = nota2; }
    public void setNota3(double nota3) { this.nota3 = nota3; }
}