package br.com.exactaworks.desafio.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.exactaworks.desafio.entity.Gasto;

public interface GastoRepository extends CrudRepository<Gasto, Integer> {

	@Query("select g from Gasto g")
	Page<Gasto> buscaPaginada(Pageable pageable);
}
