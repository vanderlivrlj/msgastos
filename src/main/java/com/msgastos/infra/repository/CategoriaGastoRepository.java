package com.msgastos.infra.repository;

import com.msgastos.infra.entity.CategoriaGastoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaGastoRepository extends JpaRepository<CategoriaGastoEntity, Long> {
}
