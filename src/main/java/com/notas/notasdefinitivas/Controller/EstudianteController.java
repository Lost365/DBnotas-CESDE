package com.notas.notasdefinitivas.Controller;

import com.notas.notasdefinitivas.Model.Estudiante;
import com.notas.notasdefinitivas.Repository.EstudianteRepository;
import com.notas.notasdefinitivas.Service.ProcesadorNotas;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    private final EstudianteRepository repo;
    private final ProcesadorNotas servicio;

    public EstudianteController(EstudianteRepository repo, ProcesadorNotas servicio) {
        this.repo = repo;
        this.servicio = servicio;
    }

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return repo.save(estudiante);
    }

    @GetMapping
    public List<Estudiante> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Estudiante obtener(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }

    @GetMapping("/{id}/estado")
    public String estado(@PathVariable Long id) {
        Estudiante estudiante = repo.findById(id).orElse(null);
        if (estudiante == null) return "Estudiante no encontrado";
        double promedio = servicio.calcularPromedio(estudiante);
        return servicio.estadoAcademico(promedio);
    }
}