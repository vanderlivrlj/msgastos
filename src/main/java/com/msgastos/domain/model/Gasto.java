package com.msgastos.domain.model;

import com.msgastos.application.dto.CategoriaGastoDTO;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Gasto {

    private Long id;
    private String descricao;
    private BigDecimal valor;
    private LocalDate data;
    private CategoriaGastoDTO categoria;

    public void validarGasto() {
        if (valor.compareTo(new BigDecimal(0)) < 0) {
            throw new IllegalArgumentException("Valor do gasto deve ser maior do que zero");
        }
    }

}
