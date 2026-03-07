package com.theus.InventarioTI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theus.InventarioTI.models.EquipamentoModel;

public interface EquipamentoRepository extends JpaRepository<EquipamentoModel, String>  {
    
}
