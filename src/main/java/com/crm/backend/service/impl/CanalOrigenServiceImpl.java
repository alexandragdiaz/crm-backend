package com.crm.backend.service.impl;

import com.crm.backend.entity.CanalOrigen;
import com.crm.backend.repository.CanalOrigenRepository;
import com.crm.backend.service.CanalOrigenService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CanalOrigenServiceImpl implements CanalOrigenService {

    private final CanalOrigenRepository canalOrigenRepository;

    public CanalOrigenServiceImpl(CanalOrigenRepository canalOrigenRepository) {
        this.canalOrigenRepository = canalOrigenRepository;
    }

    @Override
    public List<CanalOrigen> listarTodos() {
        return canalOrigenRepository.findAll();
    }

    @Override
    public Optional<CanalOrigen> buscarPorId(Long id) {
        return canalOrigenRepository.findById(id);
    }

    @Override
    public CanalOrigen guardar(CanalOrigen canalOrigen) {
        return canalOrigenRepository.save(canalOrigen);
    }

    @Override
    public void eliminar(Long id) {
        canalOrigenRepository.deleteById(id);
    }
}