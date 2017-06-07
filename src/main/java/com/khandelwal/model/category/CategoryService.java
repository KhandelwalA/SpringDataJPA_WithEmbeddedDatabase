package com.khandelwal.model.category;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khandelwal.domainmodel.category.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	/**
	 * This method add as well as update the product
	 * 
	 * @param product
	 */
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}

	/**
	 * This method will return all the products from db
	 * 
	 * @return
	 */
	public Collection<Category> getAllCategories() {

		Collection<Category> categoryList = new ArrayList<Category>();
		for (Category category : categoryRepository.findAll()) {
			categoryList.add(category);
		}
		return categoryList;
	}

	/**
	 * This method will fetch single record from db matched with passed in
	 * productId
	 * 
	 * @param categoryId
	 * @return
	 */
	public Category getCategoryById(Integer categoryId) {

		return categoryRepository.findOne(categoryId);
	}

	/**
	 * This method will delete a record from db matched with passed in
	 * productId. There are other delete methods also provided by Spring JPA
	 * 
	 * @param categoryId
	 */
	public void deleteCategory(Integer categoryId) {

		categoryRepository.delete(categoryId);
	}

	/**
	 * This method will fetch single record from db matched with passed in
	 * productName
	 * 
	 * @param productId
	 * @return
	 */
	public Category getCategoryByName(String categoryName) {

		return categoryRepository.findByCategoryName(categoryName);
	}
}
