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

import com.nmk.ecomm.model.Product;

@RestController

public class ProductServiceClient {

	@Autowired
	static RestTemplate restTemplate = new RestTemplate();
	static String productSeriviceURL = "http://localhost:8089/api/v1/product";

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceClient.class);

	public static Product getProductByIdx(int id) {
		logger.debug("Start  :ProductServiceClient .getProductByIdx() ");

		Product product = restTemplate.getForObject(productSeriviceURL + "/" + id, Product.class);
		System.out.println(product.getIdx() + " " + product.getName() + " " + product.getDisplayName() + " "
				+ product.getOverview() + " " + product.getDescription() + " " + product.getDescription1() + " "
				+ product.getAuthor() + " " + product.getImage() + " " + product.getAvailableQuantity() + " "
				+ product.getPrice() + " " + product.getSalePrice() + " " + product.getUpcCode() + " "
				+ product.getStatus() + " " + product.getProductCategoryIdx() + " " + product.getCompanyIdx() + " "
				+ product.getCreatedBy() + " " + product.getCreateDate() + " " + product.getModifiedBy() + " "
				+ product.getModifiedDate());
		logger.debug("Start  :ProductServiceClient .getProductByIdx() ");

		return product;
	}

	public static Product getAllProduct() {
		logger.debug("Start  :ProductServiceClient .getAllProduct() ");

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(productSeriviceURL, HttpMethod.GET, entity, String.class);
		logger.debug("Start  :ProductServiceClient .getAllProduct() ");

		System.out.println(result);
		return null;
	}

	public static void deleteProduct(int id) {
		logger.debug("Start  :ProductServiceClient .deleteProduct() ");

		restTemplate.delete(productSeriviceURL + "/" + id);
		logger.debug("Start  :ProductServiceClient .deleteProduct() ");

	}

	public static void createProduct(Product product) {
		logger.debug("Start  :ProductServiceClient .createProduct() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Product> request = new HttpEntity<Product>(product);
		ResponseEntity<Product> response = restTemplate.exchange(productSeriviceURL, HttpMethod.POST, request,
				Product.class);
		logger.debug("Start  :ProductServiceClient .createProduct() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("Product Data Inserted Successfully");
	}

	public static void updateProduct(Product product) {
		productSeriviceURL = "http://localhost:8089/api/v1/product/2";
		logger.debug("Start  :ProductServiceClient .updateProduct() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Product> request = new HttpEntity<Product>(product);
		ResponseEntity<Product> response = restTemplate.exchange(productSeriviceURL, HttpMethod.PUT, request,
				Product.class);
		logger.debug("Start  :ProductServiceClient .updateProduct() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("Product Data Updated Successfully");
	}

	public static void main(String[] args) {
		// We should use these for above methods
		// Product product = new
		// Product("Dell","fgsd","ddf","fdgg","sfgsg","gdgdf","sfsd",21,20.11,25.44,"dad",10,12,12
		// ,"Satish2", new java.util.Date(), "asdsaddgs", new java.util.Date());
		// updateBrand(product);
		// createProduct(product);
		// Product product = getProductByIdx(1);
		// Product product =getAllProduct();
		// System.out.println(brand.getName());
		Product product = new Product();
		// Product Product = getAllBrand();
		deleteProduct(1);

		// deleteProduct(product);
	}

	public static List<Product> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}
