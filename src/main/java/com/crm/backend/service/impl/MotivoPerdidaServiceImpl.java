package com.crm.backend.service.impl;

import com.crm.backend.entity.MotivoPerdida;
import com.crm.backend.repository.MotivoPerdidaRepository;
import com.crm.backend.service.MotivoPerdidaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotivoPerdidaServiceImpl implements MotivoPerdidaService {

    private final MotivoPerdidaRepository motivoPerdidaRepository;

    public MotivoPerdidaServiceImpl(MotivoPerdidaRepository motivoPerdidaRepository) {
        this.motivoPerdidaRepository = motivoPerdidaRepository;
    }

    @Override
    public List<MotivoPerdida> listarTodos() {
        return motivoPerdidaRepository.findAll();
    }

    @Override
    public Optional<MotivoPerdida> buscarPorId(Long id) {
        return motivoPerdidaRepository.findById(id);
    }

    @Override
    public MotivoPerdida guardar(MotivoPerdida motivoPerdida) {
        return motivoPerdidaRepository.save(motivoPerdida);
    }

    @Override
    public void eliminar(Long id) {
        motivoPerdidaRepository.deleteById(id);
    }
}
