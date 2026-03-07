package com.theus.InventarioTI.models;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "registros")
@Getter
@Setter
public class RegistroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idRegistro;

    @ManyToOne
    private UsuarioModel usuario;

    @ManyToOne
    private EquipamentoModel equipamento;

    private LocalDateTime dataHora;

    private String tipoRegistro; // "entrada" ou "saida"

}
