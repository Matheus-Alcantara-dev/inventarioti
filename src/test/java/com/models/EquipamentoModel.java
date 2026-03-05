package com.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "equipamentos")
@Getter
@Setter
public class EquipamentoModel {

    @Id
    private String numeroDeSerie;

    private String nomeProduto;
    private String marcaProduto;
    private String tipoProduto;
    private BigDecimal valorProduto;
}
