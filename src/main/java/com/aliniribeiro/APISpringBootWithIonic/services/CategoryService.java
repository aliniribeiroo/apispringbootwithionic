package com.aliniribeiro.APISpringBootWithIonic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliniribeiro.APISpringBootWithIonic.domain.Category;
import com.aliniribeiro.APISpringBootWithIonic.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category find(Integer id) {
		Category category = categoryRepository.findOne(id);
		return category;
	}
}
