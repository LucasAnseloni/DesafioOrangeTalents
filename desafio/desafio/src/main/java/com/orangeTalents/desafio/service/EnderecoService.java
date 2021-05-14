package com.orangeTalents.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orangeTalents.desafio.model.Endereco;
import com.orangeTalents.desafio.repository.EnderecoRepository;


@Service
public class EnderecoService {
		@Autowired
	private EnderecoRepository repository;
		public Endereco CadastrarEndereco (Endereco endereco) {
		return this.repository.save(endereco);
	}

}