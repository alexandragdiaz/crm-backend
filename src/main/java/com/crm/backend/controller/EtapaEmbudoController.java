package com.crm.backend.controller;

import com.crm.backend.entity.EtapaEmbudo;
import com.crm.backend.service.EtapaEmbudoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etapas-embudo")
public class EtapaEmbudoController {

    private final EtapaEmbudoService etapaEmbudoService;

    public EtapaEmbudoController(EtapaEmbudoService etapaEmbudoService) {
        this.etapaEmbudoService = etapaEmbudoService;
    }

    @GetMapping
    public List<EtapaEmbudo> listar() {
        return etapaEmbudoService.listarTodos();
    }

    @GetMapping("/{id}")
    public EtapaEmbudo buscar(@PathVariable Long id) {
        return etapaEmbudoService.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public EtapaEmbudo guardar(@RequestBody EtapaEmbudo etapaEmbudo) {
        return etapaEmbudoService.guardar(etapaEmbudo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        etapaEmbudoService.eliminar(id);
    }
}