package com.crm.backend.controller;

import com.crm.backend.entity.Ciudad;
import com.crm.backend.service.CiudadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ciudades")
public class CiudadController {

    private final CiudadService ciudadService;

    public CiudadController(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }

    @GetMapping
    public List<Ciudad> listar() {
        return ciudadService.listarTodos();
    }

    @GetMapping("/{id}")
    public Ciudad buscar(@PathVariable Long id) {
        return ciudadService.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public Ciudad guardar(@RequestBody Ciudad ciudad) {
        return ciudadService.guardar(ciudad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        ciudadService.eliminar(id);
    }
}