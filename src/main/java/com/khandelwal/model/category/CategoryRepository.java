package com.khandelwal.model.category;

import org.springframework.data.repository.CrudRepository;

import com.khandelwal.domainmodel.category.Category;

/**
 * This interface extends CrudRepository of Springframework, implementation of
 * which is provided by Spring with basic CRUD operations and developer neither
 * need to make connection with db nor to write basic CRUD operations
 * 
 * @author Abhishek Khandelwal
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Integer> {

	public Category findByCategoryName(String categoryName);
}
