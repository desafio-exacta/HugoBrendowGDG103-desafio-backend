package br.com.exactaworks.desafio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String descricao;
	
	@ManyToOne
	private Gasto gasto;
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tag )) return false;
        return id != null && id.equals(((Tag) o).getId());
    }
 
    @Override
    public int hashCode() {
        return 31;
    }
}
