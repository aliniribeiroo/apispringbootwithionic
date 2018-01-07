package com.aliniribeiro.APISpringBootWithIonic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aliniribeiro.APISpringBootWithIonic.domain.Address;
import com.aliniribeiro.APISpringBootWithIonic.domain.Category;
import com.aliniribeiro.APISpringBootWithIonic.domain.City;
import com.aliniribeiro.APISpringBootWithIonic.domain.Client;
import com.aliniribeiro.APISpringBootWithIonic.domain.Product;
import com.aliniribeiro.APISpringBootWithIonic.domain.State;
import com.aliniribeiro.APISpringBootWithIonic.domain.enums.ClientType;
import com.aliniribeiro.APISpringBootWithIonic.repository.AddressRepository;
import com.aliniribeiro.APISpringBootWithIonic.repository.CategoryRepository;
import com.aliniribeiro.APISpringBootWithIonic.repository.CityRepository;
import com.aliniribeiro.APISpringBootWithIonic.repository.ClientRepository;
import com.aliniribeiro.APISpringBootWithIonic.repository.ProductRepository;
import com.aliniribeiro.APISpringBootWithIonic.repository.StateRepository;

@SpringBootApplication
public class ApiSpringBootWithIonicApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringBootWithIonicApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");

		Product prod1 = new Product(null, "Computador", 2000.0);
		Product prod2 = new Product(null, "Impressora", 800.0);
		Product prod3 = new Product(null, "Mouse", 80.0);

		cat1.getProducts().addAll(Arrays.asList(prod1, prod2, prod3));
		cat2.getProducts().add(prod2);

		prod1.getCategories().add(cat1);
		prod2.getCategories().addAll(Arrays.asList(cat1, cat2));
		prod3.getCategories().add(cat1);

		categoryRepository.save(Arrays.asList(cat1, cat2));
		productRepository.save(Arrays.asList(prod1, prod2, prod3));

		State st1 = new State(null, "Minas Gerais");
		State st2 = new State(null, "São Paulo");
		
		City city1 = new City(null, "Uberlândia", st1);
		City city2 = new City(null, "São Paulo", st2);
		City city3 = new City(null, "Campinas", st2);

		st1.getCidades().addAll(Arrays.asList(city1));
		st2.getCidades().addAll(Arrays.asList(city2, city3));
		
		stateRepository.save(Arrays.asList(st1, st2));
		cityRepository.save(Arrays.asList(city1, city2, city3));
		
		
		Client client1 = new Client(null, "Maria Silva", "maria@gmail.com", "36378912377", ClientType.PESSOAFISICA);
		client1.getPhones().addAll(Arrays.asList("27365548", "221554845"));
		clientRepository.save(client1);
		
		Address address1 = new Address(null, "Rua Flores", "300", "Apto 303", "Jardim", "3822084", client1, city1);
		Address address2 = new Address(null, "Avenida Mattos", "105", "Sala 800", "Centro", "38777012", client1, city2);
		addressRepository.save(Arrays.asList(address1, address2));
		
	}
}
