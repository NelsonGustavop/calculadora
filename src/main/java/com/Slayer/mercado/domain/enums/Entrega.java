package com.Slayer.mercado.domain.enums;

public enum Entrega {

	ENTREGUE(0, "ROLE_ENTREGUE"), ANDAMENTO(1, "ROLE_ANDAMENTO");

	private Integer codigo;
	private String descricao;

	private Entrega(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static Entrega toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (Entrega x : Entrega.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("inválido");
	}

}
