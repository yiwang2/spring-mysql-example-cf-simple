package io.pivotal.domain;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Book {

	@Id
	@Column(length = 40)
	@GeneratedValue(generator = "randomId")
	@GenericGenerator(name = "randomId", strategy = "io.pivotal.domain.RandomIdGenerator")
	private String itemNumber;

	private String description;
	private float retailCost;
	private int yearPublished;
	private String author;
	private String title;

	public Book(String itemNumber, String description, float retailCost, int yearPublished, String author,
			String title) {
		super();
		this.itemNumber = itemNumber;
		this.description = description;
		this.retailCost = retailCost;
		this.yearPublished = yearPublished;
		this.author = author;
		this.title = title;
	}
	
	public Book () {
		
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getRetailCost() {
		return retailCost;
	}

	public void setRetailCost(float retailCost) {
		this.retailCost = retailCost;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
