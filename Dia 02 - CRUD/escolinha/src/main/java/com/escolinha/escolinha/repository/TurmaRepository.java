package com.escolinha.escolinha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escolinha.escolinha.turma.TurmaModelo;

@Repository
public interface TurmaRepository extends JpaRepository<TurmaModelo, Long> {
	
	public List<TurmaModelo>findAllByTurmaContainingIgnoreCase (String turma);

}