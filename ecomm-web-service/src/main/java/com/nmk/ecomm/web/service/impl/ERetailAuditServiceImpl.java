package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.AuditlogServiceClient;
import com.nmk.ecomm.model.AuditLog;
import com.nmk.ecomm.web.service.intf.ERetailAuditService;
import com.nmk.ecomm.web.util.AuditWebUtil;
import com.nmk.ecomm.web.vo.AuditLogVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class ERetailAuditServiceImpl implements ERetailAuditService {
	private static final Logger LOGGER = Logger.getLogger(ERetailAuditServiceImpl.class);

	public void createAuditlog(final AuditLogVO auditLogVO) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stu
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailAuditServiceImpl.createAuditlog()");
		}
		final AuditLog auditLog = AuditWebUtil.convertAuditLogVOObjectToAuditLog(auditLogVO);
		AuditlogServiceClient.createAuditlog(auditLog);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailAuditServiceImpl.createAuditlog()");
		}
	}

	public void updateBrand(final AuditLogVO auditLogVO) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailAuditServiceImpl.updateBrand()");
		}
		final AuditLog auditLog = AuditWebUtil.convertAuditLogVOObjectToAuditLog(auditLogVO);
		AuditlogServiceClient.updateBrand(auditLog);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailAuditServiceImpl.updateBrand()");
		}
	}

	public void deleteAuditlog(final int id) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailAuditServiceImpl.deleteAuditlog()");
		}
		AuditlogServiceClient.deleteAuditlog(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailAuditServiceImpl.deleteAuditlog()");
		}
	}

	public AuditLogVO getAuditlogByIdx(final int id) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailAuditServiceImpl.getAuditlogByIdx()");
		}
		final AuditLog auditLog = AuditlogServiceClient.getAuditlogByIdx(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailAuditServiceImpl.getAuditlogByIdx()");
		}
		return AuditWebUtil.convertAuditLogObjectToAuditLogVO(auditLog);
	}

	public ResponseEntity<String> getAllAuditLog() {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailAuditServiceImpl.getAllAuditLog()");
		}
	//	final ResponseEntity<String> result = AuditlogServiceClient.getAllAuditLog();
		// List<AuditLogVO> auditLogVOList =
		// AuditWebUtil.convertAuditLogListToAuditLogVOList(auditLog);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailAuditServiceImpl.getAllAuditLog()");
		}
		// System.out.println(result);
		return null;
		// return null;

	}

	public List<AuditLog> test() {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailAuditServiceImpl.getAllAuditLog()");
		}
		//final List<AuditLog> auditLog = AuditlogServiceClient.getall();
		// List<AuditLogVO> auditLogVOList =
		// AuditWebUtil.convertAuditLogListToAuditLogVOList(auditLog);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailAuditServiceImpl.getAllAuditLog()");
		}
		// System.out.println(auditLog);
		return null;

	}

}
