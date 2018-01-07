package com.aliniribeiro.APISpringBootWithIonic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliniribeiro.APISpringBootWithIonic.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
