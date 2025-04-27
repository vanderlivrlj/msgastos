package com.msgastos.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GastoCategoriaDTO {

    private Date data;
    private String descricaoGasto;
    private BigDecimal valor;
    private String descricaoCategoria;
    private String nomeCategoria;
    private String tipo;

}
