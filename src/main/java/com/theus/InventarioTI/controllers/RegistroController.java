package com.theus.InventarioTI.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theus.InventarioTI.models.RegistroModel;
import com.theus.InventarioTI.services.RegistroService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/registros")
public class RegistroController {

    @Autowired
    private RegistroService registroService;
    
    @PostMapping("/novoRegistro")
    public RegistroModel novoRegistro(@RequestBody Long idUsuario, String numeroDeSerie, LocalDateTime dataHora, String tipoRegistro) {
        return registroService.novoRegistro(idUsuario, numeroDeSerie, dataHora, tipoRegistro);
    }
}
