package com.notas.notasdefinitivas.Repository;

import com.notas.notasdefinitivas.Model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}