package com.nmk.ecomm.model.testdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.Product;
import com.nmk.ecomm.model.User;

public abstract class ProductTestDataGenerator {
	static List<Product> productList = new ArrayList<Product>();
	static {
		Product product1 = new Product("Inspiron", "Dell", "nice", "Good product", "Good", "Vikram", "mouse", 5, 900.00,
				1000.00, "6", 2, "johny", new Date(2017, 9, 5), "smith", new Date(), 2, 3);
		product1.setIdx(1);

		Product product2 = new Product("Hp", "hp", "nice", "Good product", "Good", "Vikram", "mouse", 5, 900.00,
				1000.00, "6", 2, "johny", new Date(2017, 9, 5), "smith", new Date(), 2, 3);
		product2.setIdx(2);

		Product product3 = new Product("Inspiron", "inspiron", "nice", "Good product", "Good", "Vikram", "mouse", 5,
				900.00, 1000.00, "6", 2, "johny", new Date(2017, 9, 5), "smith", new Date(), 2, 3);
		product3.setIdx(3);

		Product product4 = new Product("Lenovo", "lenovo", "nice", "Good product", "Good", "Vikram", "mouse", 5, 900.00,
				1000.00, "6", 2, "johny", new Date(2017, 9, 5), "smith", new Date(), 2, 3);
		product4.setIdx(4);

		Product product5 = new Product("Asus", "asus", "nice", "Good product", "Good", "Vikram", "mouse", 5, 900.00,
				1000.00, "6", 2, "johny", new Date(2017, 9, 5), "smith", new Date(), 2, 3);
		product5.setIdx(5);

		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		productList.add(product5);
	}

	public static List<Product> getAllProduct() {

		return productList;
	}
}
