package com.stefanini.teste;

import java.time.LocalDate;
import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;

import com.stefanini.model.Endereco;
import com.stefanini.model.Pessoa;
import com.stefanini.servico.EnderecoServico;
import com.stefanini.servico.PessoaServico;

public class App {

	// teste
	
	@Inject
	private PessoaServico pessoaServico;
	
	@Inject
	private EnderecoServico enderecoServico;

	public static void main(String[] args) {
		// CONFIGURACAO PARA INICIAR O CONTAINER PARA GERENCIAMENTO DO CDI
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		try (final SeContainer container = initializer.initialize()) {
			App app = container.select(App.class).get();
			app.executar();
		}
	}

	
	/**
	 * Execução de algum dos metodos para incluir, buscarALL, encontrar, remover
	 */
	public void executar() {
//		buscarTodos();
//		encontrar();
//		salvar();
		salvarEndereco();
//		remover();
	}
	
	
	/**
	 * Remover uma pessoa 
	 */
	private void remover() {
		pessoaServico.remover(1L);
	}

	
	/**
	 * Encontrar pessoa
	 */
	private void encontrar() {
		Optional<Pessoa> pessoa = pessoaServico.encontrar(3L);
		System.out.println("==============================================================");
		System.out.println(pessoa.isPresent() ? pessoa.get() : "Pessoa não encontrada");
//		if (pessoa.isPresent()) {
//			System.out.println("Pessoa encontrada");
//			System.out.println(pessoa.get());
//		} else {
//			System.out.println("Pessoa não encontrada");
//		}
	}

	
	/**
	 * Buscar todas pessoas e enderecos
	 */
	private void buscarTodos() {
		pessoaServico.getList().ifPresent(conteudoOptional -> {
			System.out.println("==================================================================");
			conteudoOptional.forEach(cadaPessoa -> {
				System.out.println(cadaPessoa.getEnderecos());
				System.out.println(cadaPessoa);
			});
		});
	}

	
	/**
	 * Salvar um elemento pessoa
	 */
	public void salvar() {

		Pessoa pessoa = new Pessoa("marquim", "gordao227@shit.com", LocalDate.of(1992, 07, 28), true);
		pessoaServico.salvar(pessoa);
		
//		Pessoa pessoa = new Pessoa("JOAO", LocalDate.of(1995, 8, 24));
//		pessoa.setEmail("joaom.dev@hotmail.com");
//		servico.salvar(pessoa);
	}
	
	public void salvarEndereco() {
		Optional<Pessoa> pessoaObtida = pessoaServico.encontrar(1l);
		Endereco endereco = new Endereco(pessoaObtida.get(), "sqs 777", 
				"ap666", "de favela", "Hell de Janeiro", "RJ", "72318417");
		
		enderecoServico.salvar(endereco);
	}

}
