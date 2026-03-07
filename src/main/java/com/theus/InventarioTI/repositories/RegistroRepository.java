package com.theus.InventarioTI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theus.InventarioTI.models.RegistroModel;

public interface RegistroRepository extends JpaRepository<RegistroModel, Long> {
    
}
