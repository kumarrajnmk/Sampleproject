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

import com.nmk.ecomm.model.CardTransaction;
@RestController

public class CardTransactionServiceClient {
	@Autowired
	static RestTemplate restTemplate = new RestTemplate();
	private static final Logger logger = LoggerFactory.getLogger(CardTransactionServiceClient.class);

	static String cardtransactionSeriviceURL = "http://localhost:8083/api/v1/cardtransaction";
	public static CardTransaction getCardtransactionByIdx(int id){
		logger.debug("Start  :CardTransactionServiceClient .getCardtransactionByIdx() ");

		CardTransaction cardtransaction = restTemplate.getForObject(cardtransactionSeriviceURL + "/" + id, CardTransaction.class);
		 System.out.println(cardtransaction.getIdx() + " " + cardtransaction.getTransactionid() + " " + cardtransaction.getTransactiontype() + " " + cardtransaction.getChargeamount()  + " " + cardtransaction.getDescription()  + " " + cardtransaction.getEcommusercardidx()  + " " + cardtransaction.getParentidx()  + " " + cardtransaction.getCreatedBy() + " " + cardtransaction.getCreateDate() + " " + cardtransaction.getModifiedBy() + " " + cardtransaction.getModifiedDate());
			logger.debug("Start  :CardTransactionServiceClient .getCardtransactionByIdx() ");

		 return cardtransaction;
	} 
	public static CardTransaction getAllCardTransaction()
	{	
		logger.debug("Start  :CardTransactionServiceClient .getAllCardTransaction() ");

	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    ResponseEntity<String> result = restTemplate.exchange(cardtransactionSeriviceURL, HttpMethod.GET, entity, String.class);
		logger.debug("Start  :CardTransactionServiceClient .getAllCardTransaction() ");
  
	    System.out.println(result);
		return null;
	}
	public static void deleteCardtransaction(int id){
		logger.debug("Start  :CardTransactionServiceClient .deleteCardtransaction() ");
	
		restTemplate.delete(cardtransactionSeriviceURL+ "/" + id);
		logger.debug("Start  :CardTransactionServiceClient .deleteCardtransaction() ");
	
	} 
	public static void createCardtransaction(CardTransaction cardtransaction){
		logger.debug("Start  :CardTransactionServiceClient .createCardtransaction() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<CardTransaction> request = new HttpEntity<CardTransaction>(cardtransaction);
		ResponseEntity<CardTransaction> response = restTemplate.exchange(cardtransactionSeriviceURL, HttpMethod.POST, request, CardTransaction.class);
		logger.debug("Start  :CardTransactionServiceClient .createCardtransaction() ");

		if(200==response.getStatusCodeValue())
			System.out.println("cardtransaction Data Inserted Successfully");
	}
	public static void updateCardtransaction(CardTransaction cardtransaction){
		cardtransactionSeriviceURL = "http://localhost:8083/api/v1/cardtransaction/8";
		logger.debug("Start  :CardTransactionServiceClient .updateCardtransaction() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<CardTransaction> request = new HttpEntity<CardTransaction>(cardtransaction);
		ResponseEntity<CardTransaction> response = restTemplate.exchange(cardtransactionSeriviceURL, HttpMethod.PUT, request, CardTransaction.class);
		logger.debug("Start  :CardTransactionServiceClient .updateCardtransaction() ");

		if(200==response.getStatusCodeValue())
		System.out.println("cardtransaction Data Updated Successfully");
	}
	public static void main(String[] args) {
		// We should use these for above methods
	//CardTransaction cardtransaction = new CardTransaction("77774", "cash on delivery1112", new java.util.Date(), new BigDecimal("12381263.87123"), "Description11",2,13,"vijay", new java.util.Date(),"siva",new java.util.Date());
	//	updateCardtransaction(cardtransaction);
//createCardtransaction(cardtransaction);
		//CardTransaction cardtransaction = getCardtransactionByIdx(1);
		//CardTransaction cardtransaction =getAllCardTransaction();
			//System.out.println(brand.getName());
		//CardTransaction cardtransaction = new CardTransaction(); 
		deleteCardtransaction(2);
	}
	public static List<CardTransaction> getall() {
		// TODO Auto-generated method stub
		return null;
	}
}
