 package com.nmk.ecomm.api.client;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nmk.ecomm.model.Brand;

@RestController
public class BrandServiceClient {
	@Autowired
	static RestTemplate restTemplate = new RestTemplate();


	static String brandSeriviceURL = "http://localhost:8082/api/v1/brand";

	private static final Logger logger = LoggerFactory.getLogger(BrandServiceClient.class);

	public static Brand getBrandByIdx(int id) {
		logger.debug("Start  :BrandServiceClient .getAuditlogByIdx() ");

		Brand brand = restTemplate.getForObject(brandSeriviceURL + "/" + id, Brand.class);
		System.out.println(brand.getIdx() + " " + brand.getName() + " " + brand.getDescr() + " " + brand.getCreatedBy()
				+ " " + brand.getCreateDate() + " " + brand.getModifiedBy() + " " + brand.getModifiedDate());
		logger.debug("Start  :BrandServiceClient .getAuditlogByIdx() ");

		
		
		
		return brand;
	}

	/*
	 * public static ResponseEntity<String> getAllBrands() { RestTemplate
	 * restTemplate = new RestTemplate(); HttpHeaders headers = new HttpHeaders();
	 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	 * HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	 * ResponseEntity<String> result = restTemplate.exchange(brandSeriviceURL,
	 * HttpMethod.GET, entity, String.class); //System.out.println(result); return
	 * result; }
	 */

	public static List<Brand> getAllBrands() {
		logger.debug("Start  :BrandServiceClient .getAllBrands() ");

		String brandSeriviceURL = "http://localhost:8082/api/v1/brand";
		RestTemplate restTemplate = new RestTemplate();
System.out.println("BrandServiceClient.getAllBrands()");
		String result = restTemplate.getForObject(brandSeriviceURL, String.class);

		
		List<Brand> listbrand = new ArrayList<Brand>();
		
		for(Brand brand :listbrand) {
		
			BeanUtils.copyProperties(result, brand);
		listbrand.add(brand);
	
		}
	System.out.println(result.toString());
		logger.debug("Start  :BrandServiceClient .getAllBrands() ");

		return listbrand;
	}

	public static void deleteBrand(int id) {
		logger.debug("Start  :BrandServiceClient .deleteBrand() ");

		restTemplate.delete(brandSeriviceURL + "/" + id);
		System.out.println(id + "Recorded Deleted");
		logger.debug("Start  :BrandServiceClient .deleteBrand() ");

	}

	public static void createBrand(Brand brand) {
		logger.debug("Start  :BrandServiceClient .createBrand() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Brand> request = new HttpEntity<Brand>(brand);
		ResponseEntity<Brand> response = restTemplate.exchange(brandSeriviceURL, HttpMethod.POST, request, Brand.class);
		logger.debug("Start  :BrandServiceClient .createBrand() ");

		if (201 == response.getStatusCodeValue())
			System.out.println("Brand Data Inserted Successfully");
	}

	public static void updateBrand(Brand brand) {
		brandSeriviceURL = "http://localhost:8082/api/v1/brand/114";
		logger.debug("Start  :BrandServiceClient .updateBrand() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Brand> request = new HttpEntity<Brand>(brand);
		ResponseEntity<Brand> response = restTemplate.exchange(brandSeriviceURL, HttpMethod.PUT, request, Brand.class);
		logger.debug("Start  :BrandServiceClient .updateBrand() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("Brand Data Updated Successfully");
	}

	/*
	 * public static void lockBrand(int id) { }
	 */

	public static void main(String[] args) {
		// We should use these for above methods

		// Brand brand = new Brand("ddjhdzgdj ", "Kujczvdghmgaxr", "rjaggjxdgasgcvhg",
		// new java.util.Date(), "asdjsxccghgaddgs", new java.util.Date());

		// updateBrand(brand); //working
		// createBrand(brand); //working

		// Brand brand = getBrandByIdx(115); // working
		// System.out.println(brand.getName());
		/*
		 * List<Brand> brands = getAllBrands(); for (Brand brand : brands) {
		 * System.out.println(brand.getDescr()); }
		 */

		getAllBrands(); // working
		// deleteBrand(190); //working
	}

}
