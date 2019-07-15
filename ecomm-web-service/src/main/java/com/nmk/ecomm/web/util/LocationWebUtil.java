package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.Location;
import com.nmk.ecomm.web.vo.LocationVO;

/**
 * @author NMK OPT 1
 *
 */
public class LocationWebUtil {
	public static Location convertLocationVOObjectToLocation(final LocationVO locationVO) {
		final Location location = new Location();
		try {
			BeanUtils.copyProperties(location, locationVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return location;
	}

	public static LocationVO convertLocationToLocationVO(final Location location) {
		final LocationVO locationVO = new LocationVO();
		try {
			BeanUtils.copyProperties(locationVO, location);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return locationVO;
	}

	public static List<LocationVO> convertLocationVOListToLocation(final List<Location> locations) {
		final List<LocationVO> locationList = new ArrayList<LocationVO>();
		try {
			for (final LocationVO locationVO : locationList) {
				final LocationVO location = new LocationVO();
				BeanUtils.copyProperties(location, locationVO);
				locationList.add(location);
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return locationList;
	}

}
