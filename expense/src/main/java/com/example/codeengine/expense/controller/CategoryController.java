package com.example.codeengine.expense.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.codeengine.expense.model.Category;
import com.example.codeengine.expense.repository.CategoryRepository;

@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping("/categories")
	public Collection<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@GetMapping("/category/{categoryId}")
	public ResponseEntity<?> getCategory(@PathVariable Long categoryId) {
		Optional<Category> category = categoryRepository.findById(categoryId);
		return category.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/category")
	ResponseEntity<Category> createCategory(@Valid @RequestBody Category category) throws URISyntaxException {
		Category result = categoryRepository.save(category);
		return ResponseEntity.created(new URI("/api/category" + result.getCategoryId())).body(result);
	}

	@PutMapping("/category/{categoryId}")
	ResponseEntity<Category> updateCategory(@Valid @RequestBody Category category) {
		Category result = categoryRepository.save(category);
		return ResponseEntity.ok().body(result);
	}

	@DeleteMapping("/category/{categoryId}")
	ResponseEntity<?> deleteCategory(@PathVariable Long categoryId) {
		categoryRepository.deleteById(categoryId);
		return ResponseEntity.ok().build();
	}
}
