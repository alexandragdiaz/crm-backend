package com.crm.backend.service.impl;

import com.crm.backend.entity.Proyecto;
import com.crm.backend.repository.ProyectoRepository;
import com.crm.backend.service.ProyectoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProyectoServiceImpl implements ProyectoService {

    private final ProyectoRepository proyectoRepository;

    public ProyectoServiceImpl(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    @Override
    public List<Proyecto> listarTodos() {
        return proyectoRepository.findAll();
    }

    @Override
    public Optional<Proyecto> buscarPorId(Long id) {
        return proyectoRepository.findById(id);
    }

    @Override
    public Proyecto guardar(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public void eliminar(Long id) {
        proyectoRepository.deleteById(id);
    }
}