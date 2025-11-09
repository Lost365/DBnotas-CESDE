package com.notas.notasdefinitivas.Service;

import com.notas.notasdefinitivas.Model.Estudiante;
import org.springframework.stereotype.Service;

@Service
public class ProcesadorNotas {

    public double calcularPromedio(Estudiante e) {
        return (e.getNota1() + e.getNota2() + e.getNota3()) / 3;
    }

    public String estadoAcademico(double promedio) {
        if (promedio >= 3.5) return "Aprobado";
        else if (promedio >= 2.5) return "Recuperación";
        else return "Reprobado";
    }
}