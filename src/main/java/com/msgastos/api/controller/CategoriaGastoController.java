package com.msgastos.api.controller;

import com.msgastos.application.dto.CategoriaGastoDTO;
import com.msgastos.application.service.CategoriaGastoService;
import com.msgastos.infra.entity.CategoriaGastoEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaGastoController {

    private final CategoriaGastoService service;

    public CategoriaGastoController(CategoriaGastoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CategoriaGastoEntity> criar (@RequestBody CategoriaGastoDTO categoria) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvarCategoria(categoria));
    }

}
