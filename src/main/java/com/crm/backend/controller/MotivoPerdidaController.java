package com.crm.backend.controller;

import com.crm.backend.entity.MotivoPerdida;
import com.crm.backend.service.MotivoPerdidaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/motivos-perdida")
public class MotivoPerdidaController {

    private final MotivoPerdidaService motivoPerdidaService;

    public MotivoPerdidaController(MotivoPerdidaService motivoPerdidaService) {
        this.motivoPerdidaService = motivoPerdidaService;
    }

    @GetMapping
    public List<MotivoPerdida> listar() {
        return motivoPerdidaService.listarTodos();
    }

    @GetMapping("/{id}")
    public MotivoPerdida buscar(@PathVariable Long id) {
        return motivoPerdidaService.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public MotivoPerdida guardar(@RequestBody MotivoPerdida motivoPerdida) {
        return motivoPerdidaService.guardar(motivoPerdida);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        motivoPerdidaService.eliminar(id);
    }
}
