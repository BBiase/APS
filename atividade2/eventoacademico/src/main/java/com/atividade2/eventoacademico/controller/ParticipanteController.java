package com.atividade2.eventoacademico.controller;

import com.atividade2.eventoacademico.model.Participante;
import com.atividade2.eventoacademico.services.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

    @Autowired
    private ParticipanteService participanteService;

    @GetMapping
    public List<Participante> getAllParticipantes() {
        return participanteService.findAll();
    }

    @PostMapping
    public Participante createParticipante(@RequestBody Participante participante) {
        return participanteService.save(participante);
    }
}