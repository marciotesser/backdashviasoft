package br.com.viasoft.backdashviasoft.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import br.com.viasoft.backdashviasoft.enumeradores.EnumStatus;
import br.com.viasoft.backdashviasoft.modelo.DisponibilidadeServico;

public class ConsultaStatusSite {

	public static List<DisponibilidadeServico> retornaListaStatus() {
		List<DisponibilidadeServico> servicos = new ArrayList<DisponibilidadeServico>();
		Document doc;
		try {
			doc = Jsoup.connect("http://www.nfe.fazenda.gov.br/portal/disponibilidade.aspx").get();
			Elements elements = doc.select("#ctl00_ContentPlaceHolder1_gdvDisponibilidade2").select("tbody")
					.select("tr");

			elements.remove(0);

			for (Element element : elements) {
				Elements row = element.select("td");
				String autorizador = row.get(0).text();
				String autorizacao4 = retornaStatus(retornaSrc(row.get(1).select("img")));
				String retornoAutorizacao4 = retornaStatus(retornaSrc(row.get(2).select("img")));
				String inutilizacao4 = retornaStatus(retornaSrc(row.get(3).select("img")));
				String consultaProtocolo4 = retornaStatus(retornaSrc(row.get(4).select("img")));
				String statusServico4 = retornaStatus(retornaSrc(row.get(5).select("img")));
				String tempoMedio = row.get(6).text();
				String consultaCadastro4 = retornaStatus(retornaSrc(row.get(7).select("img")));
				String recepcaoEvento4 = retornaStatus(retornaSrc(row.get(8).select("img")));
				servicos.add(new DisponibilidadeServico(new Date(), autorizador, autorizacao4, retornoAutorizacao4, inutilizacao4,
						consultaProtocolo4, statusServico4, tempoMedio, consultaCadastro4, recepcaoEvento4));
				
				System.out.println(autorizador);
				System.out.println(autorizacao4);
				System.out.println(retornoAutorizacao4);
				System.out.println(inutilizacao4);
				System.out.println(consultaProtocolo4);
				System.out.println(statusServico4);
				System.out.println(tempoMedio);
				System.out.println(consultaCadastro4);
				System.out.println(recepcaoEvento4);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return servicos;
	}

	private static String retornaStatus(String img) {
		String status = EnumStatus.NENHUM.getDescricao();
		if (!img.isEmpty()) {
			status = EnumStatus.valueOf(img.substring(8, 18).toUpperCase()).getDescricao();
		}

		return status;
	}

	private static String retornaSrc(Elements img) {
		if (img.size() > 0) {
			return img.first().attr("src");
		} else {
			return "";
		}
	}

}
