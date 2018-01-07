package com.aliniribeiro.APISpringBootWithIonic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliniribeiro.APISpringBootWithIonic.domain.Client;
import com.aliniribeiro.APISpringBootWithIonic.repository.ClientRepository;
import com.aliniribeiro.APISpringBootWithIonic.services.exceptions.ObjectNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public Client find(Integer id) {
		Client client = clientRepository.findOne(id);
		if (client == null) {
			throw new ObjectNotFoundException("Objeto não encontrado "+ id
					+ " Tipo: " + Client.class.getName());
		}
		return client;
	}
}
