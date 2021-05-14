package com.orangeTalents.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orangeTalents.desafio.model.Usuario;
import com.orangeTalents.desafio.repository.UsuarioRepository;


@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;
		public Usuario CadastrarUsuario (Usuario usuario) {
			return this.repository.save(usuario);
		}
}