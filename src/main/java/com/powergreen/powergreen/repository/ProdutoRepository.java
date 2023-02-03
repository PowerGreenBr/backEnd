package com.powergreen.powergreen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.powergreen.powergreen.model.Produto;

import java.util.List;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
