package com.crm.backend.service;

import com.crm.backend.entity.Proyecto;

import java.util.List;
import java.util.Optional;

public interface ProyectoService {

    List<Proyecto> listarTodos();

    Optional<Proyecto> buscarPorId(Long id);

    Proyecto guardar(Proyecto proyecto);

    void eliminar(Long id);

}