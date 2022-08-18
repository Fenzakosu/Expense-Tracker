package com.example.codeengine.expense.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "expense")
public class Expense {
	@Id
	private Long expenseId;

	private Instant expenseDate;

	private String descript;

	//  1000 (ID OF THE EXPENSE) -> PRIMARY KEY ,
	//	6/16/2022 (INSTANT),
	// "Visiting NY" (DESCRIPTION),
	//	1 (ID OF THE USER) 
	// 10 (ID OF THE CATEGORY) -> FOREIGN KEY
	
	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer user;

	
	
}
