package com.redesocial.TasteMood.controller;

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

import com.redesocial.TasteMood.model.PostModel;
import com.redesocial.TasteMood.repository.PostRepository;

@RestController
@RequestMapping ("/post")
@CrossOrigin ("*")
public class PostController {
	
	@Autowired
	private PostRepository repository;
	
	@GetMapping
	public ResponseEntity<java.util.List<PostModel>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping ("/{id}") public ResponseEntity<PostModel> GetById(@PathVariable long id)
	{
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.badRequest().build()); 
	}
	
	@PostMapping public ResponseEntity <PostModel> Post(@RequestBody PostModel texto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(texto));
	}
	
	@PutMapping public ResponseEntity <PostModel> Put(@RequestBody PostModel texto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(texto));
	}
	
	@DeleteMapping("/{id}")
	public void Delete (@PathVariable long id)
	{
		repository.deleteById(id);
	}

}
