package com.aliniribeiro.APISpringBootWithIonic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliniribeiro.APISpringBootWithIonic.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>{

}
