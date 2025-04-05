package com.msgastos.infra.entity;

import com.msgastos.domain.enums.TipoGasto;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_categoria_gasto")
public class CategoriaGastoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private TipoGasto  tipo;

}
