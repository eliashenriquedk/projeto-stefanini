package com.stefanini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "TB_PESSOA_PERFIL")
public class PessoaPerfil {

	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "CO_SEQ_PESSOAL_PERFIL")
private Integer id;

@ManyToOne
@JoinColumn(name = "CO_SEQ_PESSOA")
private Pessoa pessoa;

@ManyToOne
@JoinColumn(name = "CO_SEQ_PERFIL")
private Perfil perfil;


// =============================================================================================



public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Pessoa getPessoa() {
	return pessoa;
}

public void setPessoa(Pessoa pessoa) {
	this.pessoa = pessoa;
}

public Perfil getPerfil() {
	return perfil;
}

public void setPerfil(Perfil perfil) {
	this.perfil = perfil;
}


// =============================================================================================


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
	result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
	return result;
}


// =============================================================================================



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PessoaPerfil other = (PessoaPerfil) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (perfil == null) {
		if (other.perfil != null)
			return false;
	} else if (!perfil.equals(other.perfil))
		return false;
	if (pessoa == null) {
		if (other.pessoa != null)
			return false;
	} else if (!pessoa.equals(other.pessoa))
		return false;
	return true;
}


// =============================================================================================


public PessoaPerfil() {}

public PessoaPerfil(Pessoa pessoa, Perfil perfil) {
	super();
	this.pessoa = pessoa;
	this.perfil = perfil;
}


// =============================================================================================


@Override
public String toString() {
	return "PessoaPerfil [id=" + id + ", pessoa=" + pessoa + ", perfil=" + perfil + "]";
}

	



}
