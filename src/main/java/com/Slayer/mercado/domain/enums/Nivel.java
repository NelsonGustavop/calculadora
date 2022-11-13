package com.Slayer.mercado.domain.enums;

public enum Nivel {

	FUNCIONARIO(0, "ROLE_FUNCIONARIO"), ADM(1,"ROLE_ADM");

	private Integer codigo;
	private String descricao;

	private Nivel(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static Nivel toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (Nivel x : Nivel.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException(" Nível inválido");
	}

}
