package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.LocationServiceClient;
import com.nmk.ecomm.model.Location;
import com.nmk.ecomm.web.service.intf.ERetailLocationService;
import com.nmk.ecomm.web.util.LocationWebUtil;
import com.nmk.ecomm.web.vo.LocationVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class ERetailLocationServiceImpl implements ERetailLocationService {
	private static final Logger LOGGER = Logger.getLogger(ERetailLocationServiceImpl.class);

	public void createLocation(final LocationVO locationVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailLocationServiceImpl.createLocation()");
		}
		final Location location = LocationWebUtil.convertLocationVOObjectToLocation(locationVO);
		LocationServiceClient.createLocation(location);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailLocationServiceImpl.createLocation()");
		}
	}

	public LocationVO getLocationByIdx(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailLocationServiceImpl.getLocationByIdx()");
		}
		final Location location = LocationServiceClient.getLocationByIdx(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailLocationServiceImpl.getLocationByIdx()");
		}
		return LocationWebUtil.convertLocationToLocationVO(location);
	}

	public void updateLocation(final LocationVO locationVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailLocationServiceImpl.updateLocation()");
		}
		final Location location = LocationWebUtil.convertLocationVOObjectToLocation(locationVO);
		LocationServiceClient.updateLocation(location);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailLocationServiceImpl.updateLocation()");
		}
	}

	public void deleteLocation(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailLocationServiceImpl.deleteLocation()");
		}
		LocationServiceClient.deleteLocation(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailLocationServiceImpl.deleteLocation()");
		}

	}

	public List<LocationVO> getAllLocation() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailLocationServiceImpl.getAllLocation()");
		}
		List<Location> location = (List<Location>) LocationServiceClient.getAllLocation();
		final List<LocationVO> locationList = LocationWebUtil.convertLocationVOListToLocation(location);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailLocationServiceImpl.getAllLocation()");
		}
		return locationList;
	}

	public List<Location> test() {
		// TODO Auto-generated method stub
		return null;
	}

}
