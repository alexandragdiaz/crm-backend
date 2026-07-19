package com.crm.backend.controller;

import com.crm.backend.entity.Lead;
import com.crm.backend.service.LeadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
public class LeadController {

    private final LeadService leadService;

    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }

    @GetMapping
    public List<Lead> listar() {
        return leadService.listarTodos();
    }

    @GetMapping("/{id}")
    public Lead buscar(@PathVariable Long id) {
        return leadService.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public Lead guardar(@RequestBody Lead lead) {
        return leadService.guardar(lead);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        leadService.eliminar(id);
    }
}