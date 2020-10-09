package br.com.viasoft.backdashviasoft.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viasoft.backdashviasoft.modelo.DisponibilidadeServico;
import br.com.viasoft.backdashviasoft.repository.DisponibilidadeServicoRepository;
import br.com.viasoft.backdashviasoft.util.ConsultaStatusSite;

@RestController
@RequestMapping("/servicos")
public class DisponibilidadeServicoController {
	
	@Autowired
	private DisponibilidadeServicoRepository servicoRepository;
	
	@GetMapping
	public List<DisponibilidadeServico> buscarStatusAtualTodosEstados() throws IOException{
		
		List<DisponibilidadeServico> servicos = ConsultaStatusSite.retornaListaStatus();
		
		return servicos;		
	}
	
	@GetMapping("/estado/{uf}")
	public ResponseEntity<DisponibilidadeServico> buscarStatusAtualPorEstado(@PathVariable String uf) throws IOException{
		
		List<DisponibilidadeServico> servicos = ConsultaStatusSite.retornaListaStatus();
		Optional<DisponibilidadeServico> optional = servicos.stream().filter(servico -> servico.getAutorizador().toUpperCase().equals(uf.toUpperCase())).findFirst();
		if(optional.isPresent()) {
			return ResponseEntity.ok(optional.get());
		}
		
		return ResponseEntity.notFound().build();		
	}
	
	@GetMapping("/data/{data}")
	public List<DisponibilidadeServico> buscarStatusPorData(@PathVariable("data") @DateTimeFormat(pattern = "yyyy-MM-dd") Date data ){
		
		List<DisponibilidadeServico> servicos = this.servicoRepository.findByDataConsulta(data);
		
		return servicos;
	}
	

}
