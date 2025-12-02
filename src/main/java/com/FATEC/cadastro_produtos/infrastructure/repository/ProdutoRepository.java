package com.FATEC.cadastro_produtos.infrastructure.repository;

import com.FATEC.cadastro_produtos.infrastructure.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


//JpaRepository é um repositório que simplifica as pesquisas em um banco de dados pelo java
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    Optional<Produto> findByNomeProduto(String nomeProduto);
}
