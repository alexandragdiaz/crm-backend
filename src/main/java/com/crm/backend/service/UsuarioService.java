package com.crm.backend.service;

import com.crm.backend.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> listarTodos();

    Optional<Usuario> buscarPorId(Long id);

    Usuario guardar(Usuario usuario);

    void eliminar(Long id);

}