package com.stefanini.servico;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import com.stefanini.dao.PessoaPerfilDAO;
import com.stefanini.model.PessoaPerfil;
import com.stefanini.util.IGenericService;

public class PessoaPerfilServico implements IGenericService<PessoaPerfil, Integer> {

	@Inject
	private PessoaPerfilDAO dao;

	/**
	 * Atualizar o dados de uma pessoa
	 */
	@Override
	public PessoaPerfil salvar(@Valid PessoaPerfil entity) {
		return dao.salvar(entity);
	}
	
	/**
	 * Atualizar o dados de uma pessoa
	 */
	@Override
	public PessoaPerfil atualizar(@Valid PessoaPerfil entity) {
		return dao.atualizar(entity);
	}
	
	/**
	 * Remover uma pessoa pelo id
	 */
	@Override
	public void remover(@Valid Integer id) {
	dao.remover(id);
	}
	
	/**
	 * Buscar uma lista de Pessoa
	 */
	@Override
	public Optional<List<PessoaPerfil>> getList() {
		return Optional.empty();
	}

	/**
	 * Buscar uma Pessoa pelo ID
	 */
	@Override
	public Optional<PessoaPerfil> encontrar(Integer id) {
		return dao.encontrar(id);
	}
}
