package br.senai.sp.jandira.model;

public enum Console {
	
	XBOX("Xbox 360"),
	XBOXONE("Xbox One"),
	PLAYSTATIONTWO("Playstation2"),
	PLAYSTATIONFOUR("Playstatin4");
	
	private String descricao;
	
	private Console(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}
