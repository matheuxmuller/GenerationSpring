package com.CrecheXuxa.Creche.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CrecheXuxa.Creche.model.TurmaModel;

@Repository
public interface TurmaRepository extends JpaRepository <TurmaModel, Long> {
	
	public List<TurmaModel>findAllByTurmaContainingIgnoreCase (String turma);

}
