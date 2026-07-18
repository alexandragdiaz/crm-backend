package com.crm.backend.service;

import com.crm.backend.entity.CanalOrigen;

import java.util.List;
import java.util.Optional;

public interface CanalOrigenService {

    List<CanalOrigen> listarTodos();

    Optional<CanalOrigen> buscarPorId(Long id);

    CanalOrigen guardar(CanalOrigen canalOrigen);

    void eliminar(Long id);
}