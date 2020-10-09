package br.com.viasoft.backdashviasoft.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "disponibilidade_servico")
public class DisponibilidadeServico {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	@Column(name = "dataconsulta")
	private Date dataConsulta;
	private String autorizador;
	private String autorizacao4;
	@Column(name = "retornoautorizacao4")
	private String retornoAutorizacao4;
	private String inutilizacao4;
	@Column(name = "consultaprotocolo4")
	private String consultaProtocolo4;
	@Column(name = "statusservico4")
	private String statusServico4;
	@Column(name = "tempomedio")
	private String tempoMedio;
	@Column(name = "consultacadastro4")
	private String consultaCadastro4;
	@Column(name = "recepcaoevento4")
	private String recepcaoEvento4;
	
	public DisponibilidadeServico() {
		// TODO Auto-generated constructor stub
	}

	public DisponibilidadeServico(Date dataConsulta, String autorizador, String autorizacao4,
			String retornoAutorizacao4, String inutilizacao4, String consultaProtocolo4, String statusServico4,
			String tempoMedio, String consultaCadastro4, String recepcaoEvento4) {
		super();
		this.dataConsulta = dataConsulta;
		this.autorizador = autorizador;
		this.autorizacao4 = autorizacao4;
		this.retornoAutorizacao4 = retornoAutorizacao4;
		this.inutilizacao4 = inutilizacao4;
		this.consultaProtocolo4 = consultaProtocolo4;
		this.statusServico4 = statusServico4;
		this.tempoMedio = tempoMedio;
		this.consultaCadastro4 = consultaCadastro4;
		this.recepcaoEvento4 = recepcaoEvento4;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getAutorizador() {
		return autorizador;
	}
	public void setAutorizador(String autorizador) {
		this.autorizador = autorizador;
	}
	public String getAutorizacao4() {
		return autorizacao4;
	}
	public void setAutorizacao4(String autorizacao4) {
		this.autorizacao4 = autorizacao4;
	}
	public String getRetornoAutorizacao4() {
		return retornoAutorizacao4;
	}
	public void setRetornoAutorizacao4(String retornoAutorizacao4) {
		this.retornoAutorizacao4 = retornoAutorizacao4;
	}
	public String getInutilizacao4() {
		return inutilizacao4;
	}
	public void setInutilizacao4(String inutilizacao4) {
		this.inutilizacao4 = inutilizacao4;
	}
	public String getConsultaProtocolo4() {
		return consultaProtocolo4;
	}
	public void setConsultaProtocolo4(String consultaProtocolo4) {
		this.consultaProtocolo4 = consultaProtocolo4;
	}
	public String getStatusServico4() {
		return statusServico4;
	}
	public void setStatusServico4(String statusServico4) {
		this.statusServico4 = statusServico4;
	}
	public String getTempoMedio() {
		return tempoMedio;
	}
	public void setTempoMedio(String tempoMedio) {
		this.tempoMedio = tempoMedio;
	}
	public String getConsultaCadastro4() {
		return consultaCadastro4;
	}
	public void setConsultaCadastro4(String consultaCadastro4) {
		this.consultaCadastro4 = consultaCadastro4;
	}
	public String getRecepcaoEvento4() {
		return recepcaoEvento4;
	}
	public void setRecepcaoEvento4(String recepcaoEvento4) {
		this.recepcaoEvento4 = recepcaoEvento4;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autorizacao4 == null) ? 0 : autorizacao4.hashCode());
		result = prime * result + ((autorizador == null) ? 0 : autorizador.hashCode());
		result = prime * result + ((consultaCadastro4 == null) ? 0 : consultaCadastro4.hashCode());
		result = prime * result + ((consultaProtocolo4 == null) ? 0 : consultaProtocolo4.hashCode());
		result = prime * result + ((dataConsulta == null) ? 0 : dataConsulta.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inutilizacao4 == null) ? 0 : inutilizacao4.hashCode());
		result = prime * result + ((recepcaoEvento4 == null) ? 0 : recepcaoEvento4.hashCode());
		result = prime * result + ((retornoAutorizacao4 == null) ? 0 : retornoAutorizacao4.hashCode());
		result = prime * result + ((statusServico4 == null) ? 0 : statusServico4.hashCode());
		result = prime * result + ((tempoMedio == null) ? 0 : tempoMedio.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DisponibilidadeServico other = (DisponibilidadeServico) obj;
		if (autorizacao4 == null) {
			if (other.autorizacao4 != null)
				return false;
		} else if (!autorizacao4.equals(other.autorizacao4))
			return false;
		if (autorizador == null) {
			if (other.autorizador != null)
				return false;
		} else if (!autorizador.equals(other.autorizador))
			return false;
		if (consultaCadastro4 == null) {
			if (other.consultaCadastro4 != null)
				return false;
		} else if (!consultaCadastro4.equals(other.consultaCadastro4))
			return false;
		if (consultaProtocolo4 == null) {
			if (other.consultaProtocolo4 != null)
				return false;
		} else if (!consultaProtocolo4.equals(other.consultaProtocolo4))
			return false;
		if (dataConsulta == null) {
			if (other.dataConsulta != null)
				return false;
		} else if (!dataConsulta.equals(other.dataConsulta))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inutilizacao4 == null) {
			if (other.inutilizacao4 != null)
				return false;
		} else if (!inutilizacao4.equals(other.inutilizacao4))
			return false;
		if (recepcaoEvento4 == null) {
			if (other.recepcaoEvento4 != null)
				return false;
		} else if (!recepcaoEvento4.equals(other.recepcaoEvento4))
			return false;
		if (retornoAutorizacao4 == null) {
			if (other.retornoAutorizacao4 != null)
				return false;
		} else if (!retornoAutorizacao4.equals(other.retornoAutorizacao4))
			return false;
		if (statusServico4 == null) {
			if (other.statusServico4 != null)
				return false;
		} else if (!statusServico4.equals(other.statusServico4))
			return false;
		if (tempoMedio == null) {
			if (other.tempoMedio != null)
				return false;
		} else if (!tempoMedio.equals(other.tempoMedio))
			return false;
		return true;
	}
	
}
