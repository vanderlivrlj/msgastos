package com.msgastos.application.service;

import com.msgastos.application.dto.CategoriaGastoDTO;
import com.msgastos.application.dto.GastoDTO;
import com.msgastos.application.mapper.GastoMapper;
import com.msgastos.domain.model.GastoCategoriaDTO;
import com.msgastos.infra.entity.CategoriaGastoEntity;
import com.msgastos.infra.entity.GastoEntity;
import com.msgastos.infra.repository.CategoriaGastoRepository;
import com.msgastos.infra.repository.GastoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoService {

    private final GastoRepository repository;
    private final GastoMapper gastoMapper;
    private final CategoriaGastoRepository categoriaGastoRepository;

    public GastoService(GastoRepository repository, GastoMapper gastoMapper, CategoriaGastoRepository categoriaGastoRepository) {
        this.repository = repository;
        this.gastoMapper = gastoMapper;
        this.categoriaGastoRepository = categoriaGastoRepository;
    }

    @Transactional
    public GastoEntity salvarGasto(GastoDTO dto) {
        GastoEntity entity = new GastoEntity();

        CategoriaGastoEntity categoria = categoriaGastoRepository.findById(dto.categoria()).orElseThrow((() -> new RuntimeException("Categoria não encontrada")));

        entity.setDescricao(dto.descricao());
        entity.setValor(dto.valor());
        entity.setData(dto.data());
        entity.setCategoria(categoria);
        return repository.save(entity);
    }

    public List<GastoCategoriaDTO> listarGastos() {

        List<GastoCategoriaDTO> categoriaGastoDTOS = repository.listarGastos();
        return categoriaGastoDTOS;
    }

}
