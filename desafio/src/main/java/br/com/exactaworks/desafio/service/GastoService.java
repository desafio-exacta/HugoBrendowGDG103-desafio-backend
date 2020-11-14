package br.com.exactaworks.desafio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.exactaworks.desafio.entity.Gasto;
import br.com.exactaworks.desafio.repository.GastoRepository;

@Service
public class GastoService {
	
	@Autowired
	private GastoRepository gastoRepository;

	public Page<Gasto> find(Pageable pageable) {
		return gastoRepository.buscaPaginada(pageable);
	}
	
	public Gasto findById(Integer id) {
		Optional<Gasto> gastoOptional = gastoRepository.findById(id);
		if (gastoOptional.isPresent()) {
			return gastoOptional.get();
		}
		
		return null;
	}
	
	public Gasto save(Gasto gasto) {
		return gastoRepository.save(gasto);
	}
	
	public void delete(Gasto gasto) {
		gastoRepository.delete(gasto);
	}
}
