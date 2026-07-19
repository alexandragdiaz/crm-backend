package com.crm.backend.service;

import com.crm.backend.entity.Lead;

import java.util.List;
import java.util.Optional;

public interface LeadService {

    List<Lead> listarTodos();

    Optional<Lead> buscarPorId(Long id);

    Lead guardar(Lead lead);

    void eliminar(Long id);

}