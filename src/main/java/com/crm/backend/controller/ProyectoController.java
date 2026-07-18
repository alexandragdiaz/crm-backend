package com.crm.backend.controller;

import com.crm.backend.entity.Proyecto;
import com.crm.backend.service.ProyectoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {

    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @GetMapping
    public List<Proyecto> listar() {
        return proyectoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Proyecto buscar(@PathVariable Long id) {
        return proyectoService.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public Proyecto guardar(@RequestBody Proyecto proyecto) {
        return proyectoService.guardar(proyecto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        proyectoService.eliminar(id);
    }
}