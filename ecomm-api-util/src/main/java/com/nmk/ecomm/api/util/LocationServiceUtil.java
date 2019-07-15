package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.Location;
import com.nmk.ecomm.service.entity.EcommLocation;

/**
 * @author NMK OPT 1
 *
 */
public class LocationServiceUtil {
	public static Location convertEcommLocationObjectToLocation(final EcommLocation ecommLocation) {
		final Location location = new Location();
		try {
			BeanUtils.copyProperties(location, ecommLocation);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return location;
	}

	public static EcommLocation convertLocationToEcommLocation(final Location location) {
		final EcommLocation ecommLocation = new EcommLocation();
		try {
			BeanUtils.copyProperties(ecommLocation, location);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommLocation;
	}

	public static List<Location> convertEcommLocationListToLocation(final List<EcommLocation> ecommLocationList) {
		final List<Location> transLocation = new ArrayList<Location>();
		try {
			for (final EcommLocation ecommLocation : ecommLocationList) {
				final Location transType = new Location();
				BeanUtils.copyProperties(transType, ecommLocation);
				transLocation.add(transType);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return transLocation;
	}
}
