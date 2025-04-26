package com.msgastos.api.controller;

import com.msgastos.application.dto.CategoriaGastoDTO;
import com.msgastos.application.dto.GastoDTO;
import com.msgastos.application.service.CategoriaGastoService;
import com.msgastos.infra.entity.CategoriaGastoEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaGastoController {

    private final CategoriaGastoService service;

    public CategoriaGastoController(CategoriaGastoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CategoriaGastoEntity> criar(@RequestBody CategoriaGastoDTO categoria) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvarCategoria(categoria));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaGastoDTO> listarCategoriaId(@PathVariable("id") Long idCategoria) {
        CategoriaGastoDTO categoriaGastoDTO  = service.buscarCategoriaGasto(idCategoria);
        return ResponseEntity.ok(categoriaGastoDTO);
    }


}
