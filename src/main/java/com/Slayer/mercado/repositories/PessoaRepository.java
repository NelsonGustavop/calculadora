package com.Slayer.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Slayer.mercado.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
