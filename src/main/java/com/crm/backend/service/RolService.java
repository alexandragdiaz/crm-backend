package com.crm.backend.service;

import com.crm.backend.entity.Rol;

import java.util.List;
import java.util.Optional;

public interface RolService {

    List<Rol> listarTodos();

    Optional<Rol> buscarPorId(Long id);

    Rol guardar(Rol rol);

    void eliminar(Long id);

}
