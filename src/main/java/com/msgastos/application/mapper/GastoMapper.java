package com.msgastos.application.mapper;

import com.msgastos.domain.model.GastoCategoriaDTO;
import com.msgastos.infra.entity.GastoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GastoMapper {

    GastoCategoriaDTO toModel(GastoEntity gastoEntity);

    List<GastoCategoriaDTO> toDTOList(List<GastoEntity> entities);

}
