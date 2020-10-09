package br.com.viasoft.backdashviasoft.conexaojdbc;

import java.sql.Connection;

public class GerenciaConexao {
	
	public static Connection openSession() throws Exception {
		try {
			return FabricaConexoes.getInstance().abrirSessao();
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void closeSession() {
		try {
			FabricaConexoes.getInstance().fecharSessao();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

}
