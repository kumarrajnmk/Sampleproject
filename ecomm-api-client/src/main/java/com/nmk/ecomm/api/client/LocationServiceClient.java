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

import com.nmk.ecomm.model.Location;

@RestController
public class LocationServiceClient {
	@Autowired
	static RestTemplate restTemplate = new RestTemplate();
	static String locationSeriviceURL = "http://localhost:8086/api/v1/location";
	private static final Logger logger = LoggerFactory.getLogger(LocationServiceClient.class);

	public static Location getLocationByIdx(int id) {
		logger.debug("Start  :LocationServiceClient .getLocationByIdx() ");

		Location location = restTemplate.getForObject(locationSeriviceURL + "/" + id, Location.class);
		System.out.println(location.getIdx() + " " + location.getName() + " " + location.getAddress1() + " "
				+ location.getAddress2() + " " + location.getCity() + " " + location.getState() + " "
				+ location.getCountry() + " " + location.getPhone() + " " + location.getFax() + " "
				+ location.getCreatedBy() + " " + location.getCreateDate() + " " + location.getModifiedBy() + " "
				+ location.getModifiedDate());
		logger.debug("Start  :LocationServiceClient .getLocationByIdx() ");

		return location;
	}

	public static Location getAllLocation() {
		logger.debug("Start  :LocationServiceClient .getAllLocation() ");

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(locationSeriviceURL, HttpMethod.GET, entity,
				String.class);

		logger.debug("Start  :LocationServiceClient .getAllLocation() ");

		System.out.println(result);
		return null;
	}

	public static void deleteLocation(int id) {
		logger.debug("Start  :LocationServiceClient .deleteLocation() ");
		restTemplate.delete(locationSeriviceURL + "/" + id);
		logger.debug("Start  :LocationServiceClient .deleteLocation() ");

	}

	public static void createLocation(Location location) {
		logger.debug("Start  :LocationServiceClient .updateLocation() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Location> request = new HttpEntity<Location>(location);
		ResponseEntity<Location> response = restTemplate.exchange(locationSeriviceURL, HttpMethod.POST, request,
				Location.class);
		logger.debug("Start  :LocationServiceClient .updateLocation() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("Location Data Inserted Successfully");
	}

	public static void updateLocation(Location location) {
		locationSeriviceURL = "http://localhost:8086/api/v1/location/1";
		logger.debug("Start  :LocationServiceClient .updateLocation() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Location> request = new HttpEntity<Location>(location);
		ResponseEntity<Location> response = restTemplate.exchange(locationSeriviceURL, HttpMethod.PUT, request,
				Location.class);
		logger.debug("Start  :LocationServiceClient .updateLocation() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("Location Data Updated Successfully");
	}

	public static void main(String[] args) {
		// We should use these for above methods
		// Location location = new Location("nikitha12", "2-111", "Golden Deluxe Mess",
		// "Hyderabad", "Telangana","500004","India", "8978055587", "9158875545",
		// "satish", new java.util.Date(), "assfsdf", new java.util.Date());

		// updateLocation(location);
		// createLocation(location);
		// Location location = getLocationByIdx(1);
		// Location location = getAllLocation();
		// Location location = new Location();
		// deleteLocation(9);
	}

	public static List<Location> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}
