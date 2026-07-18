package com.crm.backend.service;

import com.crm.backend.entity.Ciudad;

import java.util.List;
import java.util.Optional;

public interface CiudadService {

    List<Ciudad> listarTodos();

    Optional<Ciudad> buscarPorId(Long id);

    Ciudad guardar(Ciudad ciudad);

    void eliminar(Long id);

}