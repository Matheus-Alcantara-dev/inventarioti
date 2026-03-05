package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.models.RegistroModel;

public interface RegistroRepository extends JpaRepository<RegistroModel, Long> {
    
}
