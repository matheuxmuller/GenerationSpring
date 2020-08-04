package com.redesocial.TasteMood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.redesocial.TasteMood.model.UserModel;


public interface UserRepository extends JpaRepository <UserModel, Long>{

}
