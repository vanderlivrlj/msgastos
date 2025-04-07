package com.msgastos.application.service;

import com.msgastos.application.dto.GastoDTO;
import com.msgastos.application.mapper.GastoMapper;
import com.msgastos.infra.entity.GastoEntity;
import com.msgastos.infra.repository.GastoRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoService {

    private final GastoRepository repository;
    private final GastoMapper gastoMapper;

    public GastoService(GastoRepository repository, GastoMapper gastoMapper) {
        this.repository = repository;
        this.gastoMapper = gastoMapper;
    }

    @Transactional
    public GastoEntity salvarGasto(GastoDTO dto) {
        GastoEntity entity = new GastoEntity();
        entity.setDescricao(dto.descricao());
        entity.setValor(dto.valor());
        entity.setData(dto.data());
        return repository.save(entity);
    }

    public List<GastoDTO> listarGastos() {

        List<GastoEntity> entities = repository.findAll();
        return gastoMapper.toDTOList(entities);
    }

}
