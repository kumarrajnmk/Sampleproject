package com.nmk.ecomm.model.testdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.CardType;

public abstract class CardTypeTestDataGenerator {
	static List<CardType> cardTypeList = new ArrayList<CardType>();
	static {
		CardType cardType1 = new CardType("Karthik","375811111111115","2/23",new Date(2019,8,10),"	",new Date());
		cardType1.setIdx(0);
		
		CardType cardType2 = new CardType("Willium","5404000000000001","2/21",new Date(2019,8,10),"145",new Date());
		cardType2.setIdx(1);
		
		CardType cardType3 = new CardType("Jadav","4900000000000086","2/20",new Date(2019,8,10),"711",new Date());
		cardType3.setIdx(2);
	
		
		CardType cardType4 = new CardType("Buvi","4003600000000006","3/30",new Date(2019,8,10),"699",new Date());
		cardType4.setIdx(3);
		
		CardType cardType5 = new CardType("Ronaldo","4242424242424242","2/25",new Date(2019,8,10),"788",new Date());
		cardType5.setIdx(4);
		
		cardTypeList.add(cardType1);
		cardTypeList.add(cardType2);
		cardTypeList.add(cardType3);
		cardTypeList.add(cardType4);
		cardTypeList.add(cardType5);
	}
	public static List<CardType> getAllCardTypes() {
	    return cardTypeList;
	}
	public static CardType getCardType(int index) {
		return cardTypeList.get(index);
	}
}
