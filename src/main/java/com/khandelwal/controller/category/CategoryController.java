package com.khandelwal.controller.category;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khandelwal.domainmodel.category.Category;
import com.khandelwal.model.category.CategoryService;

@RequestMapping("/category")
@RestController
public class CategoryController {

	private CategoryService categoryService;

	@Autowired
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}

	@RequestMapping(value = "/addCategory", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCategory(@RequestBody Category category) {

		categoryService.addCategory(category);
	}

	/**
	 * This method returns all the products from db
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/getAllCategories", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Collection<Category>> getAllCategories() {

		return new ResponseEntity<Collection<Category>>(categoryService.getAllCategories(), HttpStatus.OK);
	}

	/**
	 * This method will fetch the matched product from db
	 * 
	 * @param categoryId
	 * @return
	 */
	@RequestMapping(value = "/getCategoryById/{categoryId}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Category getCategoryById(@PathVariable("categoryId") Integer categoryId) {

		return categoryService.getCategoryById(categoryId);
	}

	/**
	 * This method delete the matched record from db
	 * 
	 * @param categoryId
	 */
	@RequestMapping(value = "/deleteCategoryId/{categoryId}", method = RequestMethod.DELETE)
	public void deleteCategoryById(@PathVariable("categoryId") Integer categoryId) {

		categoryService.deleteCategory(categoryId);
	}

	/**
	 * This method will fetch the matched product from db
	 * 
	 * @param productId
	 * @return
	 */
	@RequestMapping(value = "/getCategoryByName/{categoryName}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Category getCategoryByName(@PathVariable("categoryName") String categoryName) {

		return categoryService.getCategoryByName(categoryName);
	}
}
