package com.msgastos.application.mapper;

import com.msgastos.application.dto.GastoDTO;
import com.msgastos.infra.entity.GastoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GastoMapper {

    GastoDTO toModel(GastoEntity gastoEntity);
    GastoEntity toEntity(GastoDTO gastoDTO);
    GastoEntity toDto(GastoDTO gastoDTO);
    List<GastoDTO> toDTOList(List<GastoEntity> entities);

}
