package com.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.EquipamentoModel;
import com.models.RegistroModel;
import com.models.UsuarioModel;
import com.repositories.EquipamentoRepository;
import com.repositories.RegistroRepository;
import com.repositories.UsuarioRepository;

@Service
public class RegistroService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EquipamentoRepository equipamentoRepository;

    @Autowired
    private RegistroRepository registroRepository;

    public RegistroModel novoRegistro(Long idUsuario, String numeroDeSerie, LocalDateTime dataHora, String tipoRegistro) {

        // Lógica para registrar a entrada ou saída de um equipamento
        RegistroModel registro = new RegistroModel();

        // Verificar se o usuário existe
        UsuarioModel usuario = usuarioRepository.findById(idUsuario).orElse(null);
        if (usuario == null) {
            throw new IllegalArgumentException("Usuário não encontrado");
        }
        registro.setUsuario(usuario);

        // Verificar se o equipamento existe
        EquipamentoModel equipamento = equipamentoRepository.findById(numeroDeSerie).orElse(null);
        if (equipamento == null) {
            throw new IllegalArgumentException("Equipamento não encontrado");
        }
        registro.setEquipamento(equipamento);

        // Criar um novo registro com a data/hora atual e tipo do registro
        registro.setDataHora(LocalDateTime.now());
        registro.setTipoRegistro(tipoRegistro);

        // Salvar o registro no banco de dados
        return registroRepository.save(registro); // Retornar o registro salvo
    }
}
