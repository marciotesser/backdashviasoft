package br.com.viasoft.backdashviasoft.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.viasoft.backdashviasoft.modelo.DisponibilidadeServico;
import br.com.viasoft.backdashviasoft.repository.DisponibilidadeServicoRepository;

@Component
@EnableScheduling
public class AgendadorVerificaStatus {
	
	private final long SEGUNDO = 1000;
    private final long MINUTO = SEGUNDO * 60; 
    
    @Autowired
    private DisponibilidadeServicoRepository servicoRepository;
    
    @Scheduled(fixedDelay = MINUTO * 5)
    public void verificaCincoMinutos() {
    	
    	List<DisponibilidadeServico> servicos = ConsultaStatusSite.retornaListaStatus();
    	
    	for(DisponibilidadeServico servico : servicos) {
    		this.servicoRepository.save(servico);
    	}
    }

}
