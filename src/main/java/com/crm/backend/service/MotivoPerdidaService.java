package com.crm.backend.service;

import com.crm.backend.entity.MotivoPerdida;

import java.util.List;
import java.util.Optional;

public interface MotivoPerdidaService {

    List<MotivoPerdida> listarTodos();

    Optional<MotivoPerdida> buscarPorId(Long id);

    MotivoPerdida guardar(MotivoPerdida motivoPerdida);

    void eliminar(Long id);

}
