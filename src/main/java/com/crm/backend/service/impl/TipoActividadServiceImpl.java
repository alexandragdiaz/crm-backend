package com.crm.backend.service.impl;

import com.crm.backend.entity.TipoActividad;
import com.crm.backend.repository.TipoActividadRepository;
import com.crm.backend.service.TipoActividadService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoActividadServiceImpl implements TipoActividadService {

    private final TipoActividadRepository tipoActividadRepository;

    public TipoActividadServiceImpl(TipoActividadRepository tipoActividadRepository) {
        this.tipoActividadRepository = tipoActividadRepository;
    }

    @Override
    public List<TipoActividad> listarTodos() {
        return tipoActividadRepository.findAll();
    }

    @Override
    public Optional<TipoActividad> buscarPorId(Long id) {
        return tipoActividadRepository.findById(id);
    }

    @Override
    public TipoActividad guardar(TipoActividad tipoActividad) {
        return tipoActividadRepository.save(tipoActividad);
    }

    @Override
    public void eliminar(Long id) {
        tipoActividadRepository.deleteById(id);
    }
}