package com.aliniribeiro.APISpringBootWithIonic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aliniribeiro.APISpringBootWithIonic.domain.Client;
import com.aliniribeiro.APISpringBootWithIonic.services.ClientService;

@RestController
@RequestMapping(value="client")
public class ClientResources {
	
	@Autowired
	private ClientService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {		
		Client client = service.find(id);
		return ResponseEntity.ok().body(client);
	}

}
