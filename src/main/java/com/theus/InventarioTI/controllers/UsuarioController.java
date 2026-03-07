package com.theus.InventarioTI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theus.InventarioTI.models.UsuarioModel;
import com.theus.InventarioTI.services.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
    @PostMapping("/novoUsuario")
    public UsuarioModel novoUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioService.novoUsuario(usuario);
    }
    

}
