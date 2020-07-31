package com.CrecheXuxa.Creche.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CrecheXuxa.Creche.model.AlunoModel;

@Repository
public interface AlunoRepository extends JpaRepository <AlunoModel, Long>{
	
	public List<AlunoModel>findAllByNomeContainingIgnoreCase (String nome);

}
