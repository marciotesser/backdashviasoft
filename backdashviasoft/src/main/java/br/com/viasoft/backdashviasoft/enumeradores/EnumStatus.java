package br.com.viasoft.backdashviasoft.enumeradores;

public enum EnumStatus {
	NENHUM("Sem status"), BOLA_VERDE("OK"), BOLA_VERMELHA("Falha na consulta"), BOLA_AMARELA("Aguardando resposta");
	
	private String descricao;
	
	EnumStatus(String descricao){
		this.descricao = descricao;		
	}
	
	public String getDescricao() {
		return descricao;
	}
}
