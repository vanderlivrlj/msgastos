package com.msgastos.application.service;

import com.msgastos.application.dto.GastoDTO;
import com.msgastos.domain.enums.CategoriaGasto;
import com.msgastos.domain.enums.TipoGasto;
import com.msgastos.infra.entity.GastoEntity;
import com.msgastos.infra.repository.GastoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoService {
    private final GastoRepository repository;

    public GastoService(GastoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void salvarGasto(GastoDTO dto) {
        GastoEntity entity = new GastoEntity();
        entity.setDescricao(dto.descricao());
        entity.setValor(dto.valor());
        entity.setData(dto.data());
        entity.setTipo(TipoGasto.valueOf(dto.tipo()));
        entity.setCategoria(CategoriaGasto.valueOf(dto.categoria()));
        repository.save(entity);
    }

    public List<GastoDTO> listarGastos() {

        List<GastoEntity> entities = repository.findAll();

        return entities.stream().map(this::convertDto).toList();
    }

    private GastoDTO convertDto(GastoEntity entity) {

        return new GastoDTO(
                entity.getDescricao(),
                entity.getValor(),
                entity.getData(),
                entity.getTipo().name(),
                entity.getCategoria().name()
        );

    }

}
