package com.theus.InventarioTI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theus.InventarioTI.models.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
    
}
