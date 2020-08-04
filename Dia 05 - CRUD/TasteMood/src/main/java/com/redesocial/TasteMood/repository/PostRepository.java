package com.redesocial.TasteMood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.redesocial.TasteMood.model.PostModel;

public interface PostRepository extends JpaRepository <PostModel, Long>{

}
