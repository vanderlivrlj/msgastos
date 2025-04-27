package com.msgastos.infra.repository;

import com.msgastos.domain.model.GastoCategoriaDTO;
import com.msgastos.infra.entity.GastoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GastoRepository extends JpaRepository<GastoEntity, Long> {

    /* select * from TB_GASTO g inner join tb_categoria_gasto c on g.categoria_id = c.id;

    select data, g.descricao, valor, c.descricao, nome, tipo from TB_GASTO g inner join tb_categoria_gasto c on g.categoria_id = c.id;*/

    @Query(nativeQuery = true,
            value = "select g.data, g.descricao, g.valor, c.descricao, c.nome, c.tipo " +
                    "from tb_gasto g inner join tb_categoria_gasto c " +
                    "on g.categoria_id = c.id")
    List<GastoCategoriaDTO> listarGastos ();

}
