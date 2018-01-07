package com.aliniribeiro.APISpringBootWithIonic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliniribeiro.APISpringBootWithIonic.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
