package com.aliniribeiro.APISpringBootWithIonic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliniribeiro.APISpringBootWithIonic.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
