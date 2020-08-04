package com.redesocial.TasteMood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.redesocial.TasteMood.model.TemaModel;

public interface TemaRepository extends JpaRepository <TemaModel, Long> {
	
}
