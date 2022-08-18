package com.example.codeengine.expense.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "category")
public class Category {

	@Id
	private Long categoryId;

	// Travel, Grocery, ...
	@NonNull
	private String name;

	

	
	
}
