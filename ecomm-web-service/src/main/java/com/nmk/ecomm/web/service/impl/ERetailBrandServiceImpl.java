package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.BrandServiceClient;
import com.nmk.ecomm.model.Brand;
import com.nmk.ecomm.web.service.intf.ERetailBrandService;
import com.nmk.ecomm.web.util.BrandWebUtil;
import com.nmk.ecomm.web.vo.BrandVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class ERetailBrandServiceImpl implements ERetailBrandService {
	private static final Logger LOGGER = Logger.getLogger(ERetailBrandServiceImpl.class);

	public BrandVO getBrandByIdx(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailBrandServiceImpl.getBrandByIdx()");
		}
		final Brand brand = BrandServiceClient.getBrandByIdx(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailBrandServiceImpl.getBrandByIdx()");
		}
		return BrandWebUtil.convertBrandToBrandVO(brand);
	}

	public List<BrandVO> getAllBrands() {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("S	tart: ERetailBrandServiceImpl.getAllBrand()");
		}
		// List<Brand> brands = (List<Brand>) BrandServiceClient.getAllBrands();
		// List<BrandVO> BrandVOList =
		// BrandWebUtil.convertBrandListToBrandVOList(brands);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailBrandServiceImpl.getAllBrand()");
		}
		// return BrandVOList;
		return null;

	}

	public void createBrand(final BrandVO brandVO) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailBrandServiceImpl.createBrand()");
		}
		final Brand brand = BrandWebUtil.convertBrandVOObjectToBrand(brandVO);
		BrandServiceClient.createBrand(brand);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailBrandServiceImpl.createBrand()");
		}
	}

	public void updateBrand(final BrandVO brandVO) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailBrandServiceImpl.updateBrand()");
		}
		final Brand brand = BrandWebUtil.convertBrandVOObjectToBrand(brandVO);
		BrandServiceClient.updateBrand(brand);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailBrandServiceImpl.updateBrand()");
		}
	}

	public void deleteBrand(int id) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailBrandServiceImpl.deleteBrand()");
		}
		BrandServiceClient.deleteBrand(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailBrandServiceImpl.deleteBrand()");
		}
	}

	public List<Brand> test() {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailAuditServiceImpl.getAllAuditLog()");
		}
	//	final List<Brand> auditLog = BrandServiceClient.getall();
		// List<AuditLogVO> auditLogVOList =
		// AuditWebUtil.convertAuditLogListToAuditLogVOList(auditLog);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailAuditServiceImpl.getAllAuditLog()");
		}
		// System.out.println(auditLog);
		return null;

	}

}
