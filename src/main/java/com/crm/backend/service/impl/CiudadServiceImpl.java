package com.crm.backend.service.impl;

import com.crm.backend.entity.Ciudad;
import com.crm.backend.repository.CiudadRepository;
import com.crm.backend.service.CiudadService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadServiceImpl implements CiudadService {

    private final CiudadRepository ciudadRepository;

    public CiudadServiceImpl(CiudadRepository ciudadRepository) {
        this.ciudadRepository = ciudadRepository;
    }

    @Override
    public List<Ciudad> listarTodos() {
        return ciudadRepository.findAll();
    }

    @Override
    public Optional<Ciudad> buscarPorId(Long id) {
        return ciudadRepository.findById(id);
    }

    @Override
    public Ciudad guardar(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Override
    public void eliminar(Long id) {
        ciudadRepository.deleteById(id);
    }
}
