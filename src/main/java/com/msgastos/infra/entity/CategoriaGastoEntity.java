package com.msgastos.infra.entity;

import com.msgastos.domain.enums.TipoGasto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "tb_categoria_gasto")
@Getter
@Setter
public class CategoriaGastoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String descricao;
    @Enumerated(EnumType.STRING)
    @NotNull
    private TipoGasto  tipo;

}
