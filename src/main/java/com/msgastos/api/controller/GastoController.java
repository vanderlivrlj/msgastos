package com.msgastos.api.controller;

import com.msgastos.application.dto.GastoDTO;
import com.msgastos.application.service.GastoService;
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
    public void criarGasto(@RequestBody GastoDTO dto) {
        service.salvarGasto(dto);
    }

    @GetMapping
    public ResponseEntity<List<GastoDTO>> listarGastos() {
        List<GastoDTO> dtos = service.listarGastos();
        return ResponseEntity.ok(dtos);
    }
}
