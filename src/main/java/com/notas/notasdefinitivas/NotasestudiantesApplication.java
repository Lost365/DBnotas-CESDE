package com.notas.notasdefinitivas;

import com.notas.notasdefinitivas.Model.Estudiante;
import com.notas.notasdefinitivas.Repository.EstudianteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotasestudiantesApplication implements CommandLineRunner {

    private final EstudianteRepository estudianteRepository;

    public NotasestudiantesApplication(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(NotasestudiantesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("\n--- CRUD BÁSICO DE ESTUDIANTES ---");

   
        System.out.println("1. Creando y guardando estudiante inicial...");
        Estudiante estudianteInicial = new Estudiante("Sebastian", 4.5, 3.8, 4.2);
        estudianteRepository.save(estudianteInicial);
        System.out.println("Estudiante guardado: " + estudianteInicial.getNombre());

       
        System.out.println("\n2. Leyendo todos los estudiantes...");
        estudianteRepository.findAll().forEach(e -> {
            double promedio = (e.getNota1() + e.getNota2() + e.getNota3()) / 3;
            System.out.println("-> " + e.getNombre() + " | Promedio: " + String.format("%.2f", promedio));
        });
    }
}