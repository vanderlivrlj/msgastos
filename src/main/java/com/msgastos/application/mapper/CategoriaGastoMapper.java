package com.msgastos.application.mapper;


import com.msgastos.application.dto.CategoriaGastoDTO;
import com.msgastos.infra.entity.CategoriaGastoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaGastoMapper {

    List<CategoriaGastoDTO> toDTOList(List<CategoriaGastoEntity> entities);

    CategoriaGastoDTO toModel(CategoriaGastoEntity gastoEntity);
}
