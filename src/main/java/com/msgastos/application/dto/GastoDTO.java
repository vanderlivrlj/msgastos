package com.msgastos.application.dto;

import java.math.BigDecimal;
import java.time.LocalDate;


public record GastoDTO(
        String descricao,
        BigDecimal valor,
        LocalDate data,
        String tipo,
        String categoria
) {}
