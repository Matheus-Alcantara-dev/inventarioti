package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.models.EquipamentoModel;

public interface EquipamentoRepository extends JpaRepository<EquipamentoModel, String>  {
    
}
