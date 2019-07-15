package com.nmk.ecomm.model.testdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.Brand;

/**
 * @author NMK OPT 1
 *
 */
public abstract class BrandTestDataGenerator {
	static List<Brand> brandList = new ArrayList<Brand>();
	static {
		final Brand brand1 = new Brand("Dell", "Dell", "admin", new Date(2017, 9, 10), "admin", new Date());
		brand1.setIdx(1);

		Brand brand2 = new Brand("HP", "HP", "admin", new Date(2015, 10, 6), "admin", new Date());
		brand2.setIdx(2);

		Brand brand3 = new Brand("Haldiram", "Haldiram", "admin1", new Date(2016, 4, 4), "admin", new Date());
		brand3.setIdx(3);

		Brand brand4 = new Brand("McGraw-Hill", "McGraw-Hill", "admin1", new Date(2012, 11, 10), "admin", new Date());
		brand4.setIdx(4);

		Brand brand5 = new Brand("Wilson", "Wilson", "admin", new Date(2014, 2, 2), "admin", new Date());
		brand5.setIdx(5);

		brandList.add(brand1);
		brandList.add(brand2);
		brandList.add(brand3);
		brandList.add(brand4);
		brandList.add(brand5);
	}

	public static List<Brand> getAllUsers() {

		return brandList;
	}
}
