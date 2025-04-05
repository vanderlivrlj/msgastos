package com.msgastos.infra.repository;

import com.msgastos.infra.entity.GastoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GastoRepository extends JpaRepository<GastoEntity, Long> {

}
