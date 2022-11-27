package com.Slayer.mercado.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.br.CPF;

import com.Slayer.mercado.domain.enums.Nivel;

@Entity
public class Funcionario extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "funcionario")
	private List<Compra> compras = new ArrayList<>();

	public Funcionario() {
		super();
		addNivel(Nivel.FUNCIONARIO);
	}

	public Funcionario(Integer id, String nome, @CPF String cpf) {
		super(id, nome, cpf);
		addNivel(Nivel.FUNCIONARIO);
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

}
