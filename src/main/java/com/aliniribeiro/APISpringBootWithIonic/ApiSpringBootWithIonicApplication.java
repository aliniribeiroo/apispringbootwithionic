package com.aliniribeiro.APISpringBootWithIonic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aliniribeiro.APISpringBootWithIonic.domain.Category;
import com.aliniribeiro.APISpringBootWithIonic.domain.Product;
import com.aliniribeiro.APISpringBootWithIonic.repository.CategoryRepository;
import com.aliniribeiro.APISpringBootWithIonic.repository.ProductRepository;

@SpringBootApplication
public class ApiSpringBootWithIonicApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

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

	}
}
