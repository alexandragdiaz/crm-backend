package com.crm.backend.service.impl;

import com.crm.backend.entity.Lead;
import com.crm.backend.repository.LeadRepository;
import com.crm.backend.service.LeadService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeadServiceImpl implements LeadService {

    private final LeadRepository leadRepository;

    public LeadServiceImpl(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    @Override
    public List<Lead> listarTodos() {
        return leadRepository.findAll();
    }

    @Override
    public Optional<Lead> buscarPorId(Long id) {
        return leadRepository.findById(id);
    }

    @Override
    public Lead guardar(Lead lead) {
        return leadRepository.save(lead);
    }

    @Override
    public void eliminar(Long id) {
        leadRepository.deleteById(id);
    }
}