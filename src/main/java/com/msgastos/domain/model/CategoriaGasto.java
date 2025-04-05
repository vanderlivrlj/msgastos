package com.msgastos.domain.model;

import com.msgastos.domain.enums.TipoGasto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoriaGasto {

    private Long id;
    private String nome;
    private String descricao;
    private TipoGasto tipo;

}
