package com.crm.backend.controller;

import com.crm.backend.entity.Rol;
import com.crm.backend.service.RolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RolController {

    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping("/api/roles")
    public List<Rol> listarRoles() {
        return rolService.listarTodos();
    }

}