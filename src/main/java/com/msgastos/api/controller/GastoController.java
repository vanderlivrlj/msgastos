package com.msgastos.api.controller;

import com.msgastos.application.dto.GastoDTO;
import com.msgastos.application.service.GastoService;
import com.msgastos.domain.model.GastoCategoriaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gastos")
public class GastoController {

    private final GastoService service;

    public GastoController(GastoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity criarGasto(@RequestBody GastoDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvarGasto(dto));
    }

    @GetMapping
    public ResponseEntity<List<GastoCategoriaDTO>> listarGastos() {
        List<GastoCategoriaDTO> dtos = service.listarGastos();
        return ResponseEntity.ok(dtos);
    }
}
