package com.orangeTalents.desafio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangeTalents.desafio.model.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	public List<Endereco> findAllByCep(String cep);
}