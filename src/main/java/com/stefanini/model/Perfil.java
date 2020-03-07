package com.stefanini.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="TB_PERFIL")
public class Perfil {

	
/**
 * ID da Tabela
 */
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "CO_SEQ_PERFIL")
private Integer id;

@NotNull
@Column(name = "NO_PERFIL")
private String nome;

@NotNull
@Column(name = "DS_PERFIL")
private String descricao;

@NotNull
@Column(name = "DT_HORA_INCLUSAO")
private LocalDateTime inclusao;

@NotNull
@Column(name = "DT_HORA_ALTERACAO")
private LocalDateTime dataAlteracao;



// =============================================================================================



public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public LocalDateTime getInclusao() {
	return inclusao;
}

public void setInclusao(LocalDateTime inclusao) {
	this.inclusao = inclusao;
}

public LocalDateTime getAlteracao() {
	return dataAlteracao;
}

public void setAlteracao(LocalDateTime alteracao) {
	this.dataAlteracao = alteracao;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((dataAlteracao == null) ? 0 : dataAlteracao.hashCode());
	result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((inclusao == null) ? 0 : inclusao.hashCode());
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Perfil other = (Perfil) obj;
	if (dataAlteracao == null) {
		if (other.dataAlteracao != null)
			return false;
	} else if (!dataAlteracao.equals(other.dataAlteracao))
		return false;
	if (descricao == null) {
		if (other.descricao != null)
			return false;
	} else if (!descricao.equals(other.descricao))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (inclusao == null) {
		if (other.inclusao != null)
			return false;
	} else if (!inclusao.equals(other.inclusao))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	return true;
}


// =============================================================================================

public Perfil(){}

public Perfil(String nome, String descricao, LocalDateTime inclusao, LocalDateTime alteracao) {
	super();
	this.nome = nome;
	this.descricao = descricao;
	this.inclusao = inclusao;
	this.dataAlteracao = alteracao;
}


// =============================================================================================



@Override
public String toString() {
	return "Perfil [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", inclusao=" + inclusao
			+ ", alteracao=" + dataAlteracao + "]";
}





}
