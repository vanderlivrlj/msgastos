package com.msgastos.infra.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table (name = "tb_gasto")
@Getter
@Setter
public class GastoEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    private String descricao;

    private BigDecimal valor;

    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaGastoEntity categoria;
}
