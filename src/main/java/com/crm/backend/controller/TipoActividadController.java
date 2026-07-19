package com.crm.backend.controller;

import com.crm.backend.entity.TipoActividad;
import com.crm.backend.service.TipoActividadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-actividad")
public class TipoActividadController {

    private final TipoActividadService tipoActividadService;

    public TipoActividadController(TipoActividadService tipoActividadService) {
        this.tipoActividadService = tipoActividadService;
    }

    @GetMapping
    public List<TipoActividad> listar() {
        return tipoActividadService.listarTodos();
    }

    @GetMapping("/{id}")
    public TipoActividad buscar(@PathVariable Long id) {
        return tipoActividadService.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public TipoActividad guardar(@RequestBody TipoActividad tipoActividad) {
        return tipoActividadService.guardar(tipoActividad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        tipoActividadService.eliminar(id);
    }
}