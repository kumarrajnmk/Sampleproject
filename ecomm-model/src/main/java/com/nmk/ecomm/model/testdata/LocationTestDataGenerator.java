package com.nmk.ecomm.model.testdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.Category;
import com.nmk.ecomm.model.Location;

public abstract class LocationTestDataGenerator {
	static List<Location> locationList = new ArrayList<Location>();
	static {
		Location location1 = new Location("Karthik","375811111111115","2/23","sfg", "dddf", "fgfg", "dsdf", "Dgf", "dfsg", "ghd", new Date(2019,8,10),"	",new Date());;
		location1.setIdx(1);
		
		Location location2 = new Location("Karthik","375811111111115","2/23","sfg", "dddf", "fgfg", "dsdf", "Dgf", "dfsg", "ghd", new Date(2019,8,10),"	",new Date());;
		location2.setIdx(2);
		
		Location location3 = new Location("Karthik","375811111111115","2/23","sfg", "dddf", "fgfg", "dsdf", "Dgf", "dfsg", "ghd", new Date(2019,8,10),"	",new Date());;
		location3.setIdx(3);
	
		
		Location location4 =new  Location("Karthik","375811111111115","2/23","sfg", "dddf", "fgfg", "dsdf", "Dgf", "dfsg", "ghd", new Date(2019,8,10),"	",new Date());;
		location4.setIdx(4);
		
		Location location5 = new Location("Karthik","375811111111115","2/23","sfg", "dddf", "fgfg", "dsdf", "Dgf", "dfsg", "ghd", new Date(2019,8,10),"	",new Date());;
		location5.setIdx(5);
		
		locationList.add(location1);
		locationList.add(location2);
		locationList.add(location3);
		locationList.add(location4);
		locationList.add(location5);
	}
	public static List<Location> getAllCardTypes() {
	    return locationList;
	}
}
