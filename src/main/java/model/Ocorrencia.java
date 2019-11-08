package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table (name = "Ocorrencia")

public class Ocorrencia {

@Id
@GeneratedValue
@Column(name = "id_ocorrencia")
private int id;

@Column (name = "nomedoUsuario")
private String nome;
	
@Column (name = "dataOcorrencia")
private Data data;

@Column (name = "localOcorrencia")
private String Local;

@Column (name = "tipoOcorrencia")
private int Tipo;

}	



