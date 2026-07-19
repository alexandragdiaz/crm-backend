package com.crm.backend.service;

import com.crm.backend.entity.TipoActividad;

import java.util.List;
import java.util.Optional;

public interface TipoActividadService {

    List<TipoActividad> listarTodos();

    Optional<TipoActividad> buscarPorId(Long id);

    TipoActividad guardar(TipoActividad tipoActividad);

    void eliminar(Long id);

}