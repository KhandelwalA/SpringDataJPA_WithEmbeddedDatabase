package com.khandelwal.domainmodel.category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is annotated as entity class to represent object in java and table
 * row in database
 * 
 * @author Abhishek Khandelwal
 *
 */
@Entity
@Table(name = "CATEGORY")
public class Category {

	/**
	 * Annotated as Id to mark this property as a primary key of table
	 */
	@Id
	@Column(name = "CATEGORY_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;

	@Column(name = "CATEGORY_NAME", nullable = false)
	private String categoryName;

	@Column(name = "CATEGORY_DESCRIPTION", nullable = true)
	private String categoryDescription;

	public Category() {

	}

	public Category(Integer categoryId, String categoryName, String categoryDescription) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;

	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

}
