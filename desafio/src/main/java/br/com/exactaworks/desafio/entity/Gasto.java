package br.com.exactaworks.desafio.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Gasto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomePessoa;
	private String descricao;
	private LocalDate data;
	private BigDecimal valor;
	
	@OneToMany(mappedBy = "gasto", cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Tag> tags;
}
