package com.msgastos.application.dto;

import com.msgastos.domain.enums.TipoGasto;

public record CategoriaGastoDTO (Long id, String nome, String descricao, TipoGasto tipo) {
}
