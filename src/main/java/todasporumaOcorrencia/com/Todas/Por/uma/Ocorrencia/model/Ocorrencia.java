package todasporumaOcorrencia.com.Todas.Por.uma.Ocorrencia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ocorrencia")
public class Ocorrencia {

	@Id
	@GeneratedValue
	@Column(name = "idOcorrencia")
	private int id;

	@Column(name = "nomedoUsuario")
	private String nome;

	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy", timezone="GMT-3")
	@Column(name = "dataOcorrencia")
	private Date data;

	@Column(name = "localOcorrencia")
	private String local;

	@Column(name = "tipoOcorrencia")
	private int tipo;

}
