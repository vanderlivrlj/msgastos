package com.msgastos.infra.entity;

import com.msgastos.domain.enums.TipoGasto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_categoria_gasto")
@Getter
@Setter
public class CategoriaGastoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private TipoGasto  tipo;

}
