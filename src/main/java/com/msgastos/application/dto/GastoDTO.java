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
    public void validarGasto(BigDecimal valor) {
        if (valor.compareTo(new BigDecimal(0)) <= 0) {
            throw new IllegalArgumentException("Valor do gasto deve ser maior do que zero");
        }
    }
}


