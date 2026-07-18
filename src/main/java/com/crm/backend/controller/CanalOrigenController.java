package com.crm.backend.controller;

import com.crm.backend.entity.CanalOrigen;
import com.crm.backend.service.CanalOrigenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/canales-origen")
public class CanalOrigenController {

    private final CanalOrigenService canalOrigenService;

    public CanalOrigenController(CanalOrigenService canalOrigenService) {
        this.canalOrigenService = canalOrigenService;
    }

    @GetMapping
    public List<CanalOrigen> listar() {
        return canalOrigenService.listarTodos();
    }

    @GetMapping("/{id}")
    public CanalOrigen buscar(@PathVariable Long id) {
        return canalOrigenService.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public CanalOrigen guardar(@RequestBody CanalOrigen canalOrigen) {
        return canalOrigenService.guardar(canalOrigen);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        canalOrigenService.eliminar(id);
    }
}