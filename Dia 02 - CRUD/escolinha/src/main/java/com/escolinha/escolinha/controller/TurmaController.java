package com.escolinha.escolinha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolinha.escolinha.repository.TurmaRepository;
import com.escolinha.escolinha.turma.TurmaModelo;

@RestController
@RequestMapping ("/turma")
@CrossOrigin ("*")
public class TurmaController {
	
	@Autowired
	private TurmaRepository repository;
	
	@GetMapping
	public ResponseEntity<java.util.List<TurmaModelo>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping ("/{id}") public ResponseEntity<TurmaModelo> GetById(@PathVariable long id)
	{
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.badRequest().build()); 
	}
	
	@PostMapping public ResponseEntity <TurmaModelo> Post(@RequestBody TurmaModelo turma)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	}
	
	@PutMapping public ResponseEntity <TurmaModelo> Put(@RequestBody TurmaModelo turma)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	}
	
	@DeleteMapping("/{id}")
	public void Delete (@PathVariable long id)
	{
		repository.deleteById(id);
	}
		
}
