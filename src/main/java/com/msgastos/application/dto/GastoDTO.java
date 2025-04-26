package com.msgastos.application.dto;

import com.msgastos.infra.entity.CategoriaGastoEntity;

import java.math.BigDecimal;
import java.time.LocalDate;


public record GastoDTO(
        String descricao,
        BigDecimal valor,
        LocalDate data,
        Long categoria
) {
}
