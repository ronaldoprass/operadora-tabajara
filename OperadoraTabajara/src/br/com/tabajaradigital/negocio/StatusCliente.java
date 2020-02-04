package br.com.tabajaradigital.negocio;

public enum StatusCliente {
	
	
	ATIVO(1, "Ativo"), 
	INATIVO(2, "Inativo"), 
	BLOQUEADO(3,"Bloqueado");
	
    private int codigo;
    private String descricao;
	
	private StatusCliente(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		
		return codigo;
	}
	
	public String getDescricao() {
		
		return descricao;
	}
	
	

}
