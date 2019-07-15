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

import com.nmk.ecomm.model.TransType;

@RestController
public class TransactiontypeServiceClient {
	@Autowired
	static RestTemplate restTemplate = new RestTemplate();
	static String transactionSeriviceURL = "http://localhost:8090/api/v1/transactiontype";

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceClient.class);

	public static TransType getTransactiontypeIdx(int id) {
		logger.debug("Start  :TransactiontypeServiceClient .getTransactiontypeIdx() ");

		TransType transtype = restTemplate.getForObject(transactionSeriviceURL + "/" + id, TransType.class);
		// System.out.println(transtype.getIdx() + " " + transtype.getTransType() + " "
		// + transtype.getDescription() + " " + transtype.getCreatedBy() + " " +
		// transtype.getCreateDate() + " " + transtype.getModifiedBy() + " " +
		// transtype.getModifiedDate());
		logger.debug("Start  :TransactiontypeServiceClient .getTransactiontypeIdx() ");

		return transtype;
	}

	public static TransType getAllTransType() {
		logger.debug("Start  :TransactiontypeServiceClient .getAllTransType() ");

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(transactionSeriviceURL, HttpMethod.GET, entity,
				String.class);
		logger.debug("Start  :TransactiontypeServiceClient .getAllTransType() ");

		System.out.println(result);
		return null;
	}

	public static void deleteTransactiontype(int id) {
		logger.debug("Start  :TransactiontypeServiceClient .deleteTransactiontype() ");

		restTemplate.delete(transactionSeriviceURL + "/" + id);
		logger.debug("Start  :TransactiontypeServiceClient .deleteTransactiontype() ");

	}

	public static void createTransactiontype(TransType transtype) {
		logger.debug("Start  :TransactiontypeServiceClient .createTransactiontype() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<TransType> request = new HttpEntity<TransType>(transtype);
		ResponseEntity<TransType> response = restTemplate.exchange(transactionSeriviceURL, HttpMethod.POST, request,
				TransType.class);
		logger.debug("Start  :TransactiontypeServiceClient .createTransactiontype() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("Transactiontype Data Inserted Succeslsfully");
	}

	public static void updateTransactiontype(TransType transtype) {
		transactionSeriviceURL = "http://localhost:8090/api/v1/transactiontype/1";
		logger.debug("Start  :TransactiontypeServiceClient .updateTransactiontype() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<TransType> request = new HttpEntity<TransType>(transtype);
		ResponseEntity<TransType> response = restTemplate.exchange(transactionSeriviceURL, HttpMethod.PUT, request,
				TransType.class);
		logger.debug("Start  :TransactiontypeServiceClient .updateTransactiontype() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("Transactiontype Data Updated Successfully");
	}

	public static void main(String[] args) {
		// We should use these for above methods
		// TransType transtype = new TransType("Hpsd112233", "Satish2", "dfsdf", new
		// java.util.Date(), "assddgs", new java.util.Date());
		// updateBrand(brand);
		// updateTransactiontype(transtype);
		// createTransactiontype(transtype);
		// TransType transtype = getTransactiontypeIdx(5);
		// TransType transtype = getAllTransType();
		// TransType transtype = new TransType();
		deleteTransactiontype(2);
	}

	public static List<TransType> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}
