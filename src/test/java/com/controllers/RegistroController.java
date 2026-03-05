package com.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.models.RegistroModel;
import com.services.RegistroService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/registros")
public class RegistroController {

    @Autowired
    private RegistroService registroService;
    
    @PostMapping("/salvarRegistro")
    public RegistroModel novoRegistro(@RequestBody Long idUsuario, String numeroDeSerie, LocalDateTime dataHora, String tipoRegistro) {
        return registroService.novoRegistro(idUsuario, numeroDeSerie, dataHora, tipoRegistro);
    }
}
