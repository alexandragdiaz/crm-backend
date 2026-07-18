package com.crm.backend.service;

import com.crm.backend.entity.EtapaEmbudo;

import java.util.List;
import java.util.Optional;

public interface EtapaEmbudoService {

    List<EtapaEmbudo> listarTodos();

    Optional<EtapaEmbudo> buscarPorId(Long id);

    EtapaEmbudo guardar(EtapaEmbudo etapaEmbudo);

    void eliminar(Long id);

}