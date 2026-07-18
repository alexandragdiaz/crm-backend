package com.crm.backend.service.impl;

import com.crm.backend.entity.EtapaEmbudo;
import com.crm.backend.repository.EtapaEmbudoRepository;
import com.crm.backend.service.EtapaEmbudoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtapaEmbudoServiceImpl implements EtapaEmbudoService {

    private final EtapaEmbudoRepository etapaEmbudoRepository;

    public EtapaEmbudoServiceImpl(EtapaEmbudoRepository etapaEmbudoRepository) {
        this.etapaEmbudoRepository = etapaEmbudoRepository;
    }

    @Override
    public List<EtapaEmbudo> listarTodos() {
        return etapaEmbudoRepository.findAll();
    }

    @Override
    public Optional<EtapaEmbudo> buscarPorId(Long id) {
        return etapaEmbudoRepository.findById(id);
    }

    @Override
    public EtapaEmbudo guardar(EtapaEmbudo etapaEmbudo) {
        return etapaEmbudoRepository.save(etapaEmbudo);
    }

    @Override
    public void eliminar(Long id) {
        etapaEmbudoRepository.deleteById(id);
    }
}