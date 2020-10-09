package br.com.viasoft.backdashviasoft.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.viasoft.backdashviasoft.modelo.DisponibilidadeServico;

public interface DisponibilidadeServicoRepository extends JpaRepository<DisponibilidadeServico, Long> {
	
	public DisponibilidadeServico findByAutorizador(String autorizador);
	@Query("select d from disponibilidade_servico d where date(d.dataConsulta) = :data")
	public List<DisponibilidadeServico> findByDataConsulta(@Param("data") Date data);

}
