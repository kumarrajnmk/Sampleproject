package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.model.Location;
import com.nmk.ecomm.web.vo.LocationVO;

/**
 * @author NMK OPT 1
 *
 */
public interface ERetailLocationService {

	void createLocation(LocationVO locationVO);

	LocationVO getLocationByIdx(int id);

	void updateLocation(LocationVO locationVO);

	void deleteLocation(int id);

	List<LocationVO> getAllLocation();

	List<Location> test();

}
