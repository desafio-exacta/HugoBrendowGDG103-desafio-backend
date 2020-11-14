package br.com.exactaworks.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exactaworks.desafio.entity.Gasto;
import br.com.exactaworks.desafio.service.GastoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController()
@RequestMapping("/api/gastos")
public class GastoRestController {
	
	@Autowired
	private GastoService gastoService;

	@GetMapping()
	public Page<Gasto> getGastos(Pageable pageable) {
		return gastoService.find(pageable);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Gasto> getById(@PathVariable Integer id) {
		Gasto gasto = gastoService.findById(id);
		if (gasto == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(gasto, HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<Gasto> save(@RequestBody Gasto gasto) {
		Gasto gastoSalvo = gastoService.save(gasto);
		if (gastoSalvo.getId() == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(gastoSalvo, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Gasto> delete(@PathVariable Integer id) {
		Gasto gasto = gastoService.findById(id);
		if (gasto == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		gastoService.delete(gasto);
		return new ResponseEntity<>(gasto, HttpStatus.OK);
	}
}
