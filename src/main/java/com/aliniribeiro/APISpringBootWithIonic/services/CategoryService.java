package com.aliniribeiro.APISpringBootWithIonic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliniribeiro.APISpringBootWithIonic.domain.Category;
import com.aliniribeiro.APISpringBootWithIonic.repository.CategoryRepository;
import com.aliniribeiro.APISpringBootWithIonic.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category find(Integer id) {
		Category category = categoryRepository.findOne(id);
		if (category == null) {
			throw new ObjectNotFoundException("Objeto não encontrado "+ id
					+ " Tipo: " + Category.class.getName());
		}
		return category;
	}
}
