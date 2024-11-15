package com.atividade2.eventoacademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atividade2.eventoacademico.model.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
}