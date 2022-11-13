package com.Slayer.mercado.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.Slayer.mercado.domain.enums.Entrega;
import com.Slayer.mercado.domain.enums.Status;

public class Compra implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private String marca;
	private Double preco;
	//data de abertura 
	private LocalDate compraData = LocalDate.now();
	private LocalDate compraFinalizadaData;
	private Status status;
	private Entrega entrega;
	
	private Tecnico tecnico;
	private Funcionario funcionario;
	public Compra() {
		super();
	}
	public Compra(Integer id, String descricao, String marca, Double preco, Status status, Entrega entrega,
			Tecnico tecnico, Funcionario funcionario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.marca = marca;
		this.preco = preco;
		this.status = status;
		this.entrega = entrega;
		this.tecnico = tecnico;
		this.funcionario = funcionario;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public LocalDate getCompraData() {
		return compraData;
	}
	public void setCompraData(LocalDate compraData) {
		this.compraData = compraData;
	}
	public LocalDate getCompraFinalizadaData() {
		return compraFinalizadaData;
	}
	public void setCompraFinalizadaData(LocalDate compraFinalizadaData) {
		this.compraFinalizadaData = compraFinalizadaData;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Entrega getEntrega() {
		return entrega;
	}
	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Compra other = (Compra) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
