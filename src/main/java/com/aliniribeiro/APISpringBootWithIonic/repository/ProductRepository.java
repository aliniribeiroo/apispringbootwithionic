package com.aliniribeiro.APISpringBootWithIonic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliniribeiro.APISpringBootWithIonic.domain.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
