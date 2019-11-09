package todasporumaOcorrencia.com.Todas.Por.uma.Ocorrencia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import todasporumaOcorrencia.com.Todas.Por.uma.Ocorrencia.model.Ocorrencia;

	public interface OcorrenciaDAO extends JpaRepository<Ocorrencia, Integer> {
		
	}

