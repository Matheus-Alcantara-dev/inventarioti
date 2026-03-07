package com.theus.InventarioTI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theus.InventarioTI.models.UsuarioModel;
import com.theus.InventarioTI.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioModel novoUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario); // Retornar o usuário salvo
    }
}
