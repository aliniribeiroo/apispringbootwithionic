package com.aliniribeiro.APISpringBootWithIonic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aliniribeiro.APISpringBootWithIonic.domain.Category;
import com.aliniribeiro.APISpringBootWithIonic.services.CategoryService;

@RestController
@RequestMapping(value="categories")
public class CategoryResources {
	
	@Autowired
	private CategoryService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Category category = service.find(id);
		
//		Category category1 = new Category(1, "Informática");
//		Category category2 = new Category(1, "Escritório");
//		
//		List<Category> categories = Arrays.asList(category1, category2);
		
		return ResponseEntity.ok().body(category);
	}

}
