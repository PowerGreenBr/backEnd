package com.powergreen.powergreen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.powergreen.powergreen.model.Plano;

public interface PlanoRepository extends JpaRepository <Plano,Long> {

public List<Plano> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
