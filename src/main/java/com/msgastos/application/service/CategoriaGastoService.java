package com.msgastos.application.service;

import com.msgastos.application.dto.CategoriaGastoDTO;
import com.msgastos.application.mapper.CategoriaGastoMapper;
import com.msgastos.infra.entity.CategoriaGastoEntity;
import com.msgastos.infra.repository.CategoriaGastoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaGastoService {

    private final CategoriaGastoRepository repository;
    private final CategoriaGastoMapper categoriaGastoMapper;

    public CategoriaGastoService(CategoriaGastoRepository repository, CategoriaGastoMapper categoriaGastoMapper) {
        this.repository = repository;
        this.categoriaGastoMapper = categoriaGastoMapper;
    }

    /* Sobre o DDD - Quanto usar o CategoriaGastoEntity ou o CategoriaGasto do domain/model
    * Quando queremos salvar no banco, sem regra, entity direto no service
    * Quando queremos aplicar regra ou lógica, model no service e transforma para entity depois
    * Para isso podemos criar um Mapper posteriormente  */


    /* A estrutura da Categoria, foi criada difernete da de Gastos apenas para estudo
    * Posteriormente estarei padronizando todas as persistências e buscas para a melhor maneira
    * Utilizando de técnicas de clean code e padronização de código*/

    @Transactional
    public CategoriaGastoEntity salvarCategoria(CategoriaGastoDTO dto) {

        CategoriaGastoEntity categoria = new CategoriaGastoEntity();
        categoria.setNome(dto.nome());
        categoria.setDescricao(dto.descricao());
        categoria.setTipo(dto.tipo());

        return repository.save(categoria);
    }

    public CategoriaGastoDTO buscarCategoriaGasto(Long id) {
        CategoriaGastoEntity categoria = repository.findById(id).get();
        return categoriaGastoMapper.toModel(categoria);
    }

    public List<CategoriaGastoDTO> listarCategorias(){
        List<CategoriaGastoEntity> categorias = repository.findAll();
        return categoriaGastoMapper.toDTOList(categorias);
    }

}
