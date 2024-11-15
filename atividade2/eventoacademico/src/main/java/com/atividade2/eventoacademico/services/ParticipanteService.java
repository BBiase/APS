package com.atividade2.eventoacademico.services;

import com.atividade2.eventoacademico.model.Participante;
import com.atividade2.eventoacademico.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipanteService {
    @Autowired
    private ParticipanteRepository participanteRepository;

    public List<Participante> findAll() {
        return participanteRepository.findAll();
    }

    public Participante save(Participante participante) {
        return participanteRepository.save(participante);
    }
}