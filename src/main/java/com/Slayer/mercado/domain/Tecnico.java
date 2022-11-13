package com.Slayer.mercado.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Tecnico extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<Compra> compras =new ArrayList<>();
	public Tecnico() {
		super();
	}
	public Tecnico(Integer id, String nome, @CPF String cpf) {
		super(id, nome, cpf);
	}
	public List<Compra> getCompras() {
		return compras;
	}
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	
	
}
