package com.nmk.ecomm.api.client;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nmk.ecomm.model.Category;
@RestController


public class CategoryServiceClient {
	@Autowired
	static RestTemplate restTemplate = new RestTemplate();
	static String categorySeriviceURL = "http://localhost:8081/api/v1/category";

	private static final Logger logger = LoggerFactory.getLogger(CategoryServiceClient.class);

	public static Category getCategoryByIdx(int id){
		logger.debug("Start  :CategoryServiceClient .getCategoryByIdx() ");

		Category category = restTemplate.getForObject(categorySeriviceURL + "/" + id, Category.class);
		 System.out.println(category.getIdx() + " " + category.getName() + " " + category.getDescr() + " " + category.getCreatedBy() + " " + category.getCreateDate() + " " + category.getModifiedBy() + " " + category.getModifiedDate());
			logger.debug("Start  :CategoryServiceClient .getCategoryByIdx() ");

		 return category;
	}
	public static Category getAllCategory()
	{	 	     
		logger.debug("Start  :CategoryServiceClient .getAllCategory() ");

		RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    ResponseEntity<String> result = restTemplate.exchange(categorySeriviceURL, HttpMethod.GET, entity, String.class);
		logger.debug("Start  :CategoryServiceClient .getAllCategory() ");
	     
	    System.out.println(result);
		return null;
	}
	public static void deleteCategory(int id){
		logger.debug("Start  :CategoryServiceClient .deleteCategory() ");

		restTemplate.delete(categorySeriviceURL+ "/" + id);
		logger.debug("Start  :CategoryServiceClient .deleteCategory() ");

	} 
	public static void createCategory(Category category){
		logger.debug("Start  :CategoryServiceClient .createCategory() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Category> request = new HttpEntity<Category>(category);
		ResponseEntity<Category> response = restTemplate.exchange(categorySeriviceURL, HttpMethod.POST, request, Category.class);
		logger.debug("Start  :CategoryServiceClient .createCategory() ");

		if(200==response.getStatusCodeValue())
			System.out.println("Category Data Inserted Successfully");
	}
	public static void updateCategory(Category category){
		logger.debug("Start  :CategoryServiceClient .updateCategory() ");

		categorySeriviceURL = "http://localhost:8081/api/v1/category/23";
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Category> request = new HttpEntity<Category>(category);
		ResponseEntity<Category> response = restTemplate.exchange(categorySeriviceURL, HttpMethod.PUT, request, Category.class);
		logger.debug("Start  :CategoryServiceClient .updateCategory() ");

		if(200==response.getStatusCodeValue())
		System.out.println("Category Data Updated Successfully");
	}
	
	
	public static void main(String[] args) {
		// We should use these for above methods
	//Category category = new Category("Hp", "Satish2", "rajdgsg", new java.util.Date(), "asdsaddgs", new java.util.Date());
	//	updateCategory(category);
	//createCategory(category);
		//Category category = getCategoryByIdx(23);
		//Category category = getAllCategory();
			//System.out.println(brand.getName());
		//Category brand = new Category();
		//Brand category = getAllBrand();
		//System.out.println(brand.getIdx()); 
		//deleteCategory(26);
	}
	public static List<Category> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}
