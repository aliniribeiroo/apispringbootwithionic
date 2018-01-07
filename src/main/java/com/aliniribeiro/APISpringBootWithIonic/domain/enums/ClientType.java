package com.aliniribeiro.APISpringBootWithIonic.domain.enums;

public enum ClientType {

	PESSOAFISICA(1, "Pessoa Física"), PESSOAJURIDICA(2, "Pessoa Jurídica");

	private int cod;
	private String description;

	private ClientType(int cod, String desxcription) {
		this.cod = cod;
		this.description = desxcription;
	}

	public int getCod() {
		return cod;
	}

	public String getDescription() {
		return description;
	}

	public static ClientType toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (ClientType x : ClientType.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Invalid ID" + cod);

	}

}
