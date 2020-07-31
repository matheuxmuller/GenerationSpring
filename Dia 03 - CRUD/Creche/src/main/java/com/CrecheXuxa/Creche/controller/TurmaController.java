package com.CrecheXuxa.Creche.controller;

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

import com.CrecheXuxa.Creche.model.TurmaModel;
import com.CrecheXuxa.Creche.repository.TurmaRepository;

@RestController
@RequestMapping ("/turma")
@CrossOrigin ("*")
public class TurmaController {
	
	@Autowired
	private TurmaRepository repository;
	
	@GetMapping
	public ResponseEntity<java.util.List<TurmaModel>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping ("/{id}") public ResponseEntity<TurmaModel> GetById(@PathVariable long id)
	{
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.badRequest().build()); 
	}
	
	@PostMapping public ResponseEntity <TurmaModel> Post(@RequestBody TurmaModel turma)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	}
	
	@PutMapping public ResponseEntity <TurmaModel> Put(@RequestBody TurmaModel turma)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	}
	
	@DeleteMapping("/{id}")
	public void Delete (@PathVariable long id)
	{
		repository.deleteById(id);
	}

}
