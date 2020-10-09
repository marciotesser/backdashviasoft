package br.com.viasoft.backdashviasoft.conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexoes {

	private static final FabricaConexoes instance = new FabricaConexoes();

	public static FabricaConexoes getInstance() {
		return instance;
	}

	private FabricaConexoes() {
	}

	private Connection conexao;
		
	public Connection abrirSessao() throws Exception {
		String ip;		
		try {
			if (this.conexao == null) {				
				ip = "127.0.0.1";			

				Class.forName("org.postgresql.Driver").newInstance();
				String url = "jdbc:postgresql://" + ip + ":5432/dashviasoft";
				this.conexao = DriverManager.getConnection(url, "postgres", "Fime2404");
				this.conexao.setAutoCommit(false);

			}
			return this.conexao;
		} catch (Exception e) {
			throw e;
		}
	}

	

	public void fecharSessao() throws Exception {
		try {
			if (this.conexao != null) {
				this.conexao.close();
				this.conexao = null;
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public Connection getConexao() {
		return conexao;
	}

	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}
	
	


}
