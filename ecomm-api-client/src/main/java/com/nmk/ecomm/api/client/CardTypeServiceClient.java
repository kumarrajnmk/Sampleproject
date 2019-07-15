package com.nmk.ecomm.api.client;

import java.util.Arrays;
import java.util.Date;
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

import com.nmk.ecomm.model.CardType;

@RestController

public class CardTypeServiceClient {

	@Autowired
	static RestTemplate restTemplate = new RestTemplate();

	static String cardtypeSeriviceURL = "http://localhost:8084/api/v1/cardtype";
	private static final Logger logger = LoggerFactory.getLogger(CardTypeServiceClient.class);

	public static CardType getCardByIdx(int id) {
		logger.debug("Start  :CardTypeServiceClient .getCardByIdx() ");

		CardType cardtype = restTemplate.getForObject(cardtypeSeriviceURL + "/" + id, CardType.class);
		System.out.println(cardtype.getIdx() + " " + cardtype.getName() + " " + cardtype.getDescription() + " "
				+ cardtype.getCreatedBy() + " " + cardtype.getCreateDate() + " " + cardtype.getModifiedBy() + " "
				+ cardtype.getModifiedDate());
		logger.debug("Start  :CardTypeServiceClient .getCardByIdx() ");

		return cardtype;
	}

	public static void getAllCardType() {
		logger.debug("Start  :CardTypeServiceClient .getAllCardType() ");

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(cardtypeSeriviceURL, HttpMethod.GET, entity,
				String.class);
		logger.debug("Start  :CardTypeServiceClient .getAllCardType() ");

		
		 System.out.println(result);
		//return result;
	}

	public static void deleteCard(int id) {
		logger.debug("Start  :CardTypeServiceClient .deleteCard() ");

		restTemplate.delete(cardtypeSeriviceURL + "/" + id);
		
		logger.debug("Start  :CardTypeServiceClient .deleteCard() ");

	}

	public static void createCard(CardType cardtype) {
		logger.debug("Start  :CardTypeServiceClient .createCard() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<CardType> request = new HttpEntity<CardType>(cardtype);
		ResponseEntity<CardType> response = restTemplate.exchange(cardtypeSeriviceURL, HttpMethod.POST, request,
				CardType.class);
		logger.debug("Start  :CardTypeServiceClient .createCard() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("Cardtype Data Inserted Successfully");
	}

	public static void updateCard(CardType cardtype) {
		cardtypeSeriviceURL = "http://localhost:8084/api/v1/cardtype/7";
		logger.debug("Start  :CardTypeServiceClient .updateCard() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<CardType> request = new HttpEntity<CardType>(cardtype);
		ResponseEntity<CardType> response = restTemplate.exchange(cardtypeSeriviceURL, HttpMethod.PUT, request,
				CardType.class);
		logger.debug("Start  :CardTypeServiceClient .updateCard() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("Cardtype Data Updated Successfully");
	}
 
	public static void main(String[] args) {
	 CardType cardtype = new CardType("kugmjar", "Satjgish", "rajdjggsg",new Date(), "asdvvsaddgs", new java.util.Date());
		// updateCard(cardtype);
	 createCard(cardtype);
		// CardType cardtype = getCardByIdx(3);
	// getAllCardType();
		// CardType cardtype = new CardType();
	//	 deleteCard(3);
	}

	public static List<CardType> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
