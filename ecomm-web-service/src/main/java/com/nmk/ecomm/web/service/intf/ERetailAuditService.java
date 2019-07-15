package com.nmk.ecomm.web.service.intf;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.nmk.ecomm.model.AuditLog;
import com.nmk.ecomm.web.vo.AuditLogVO;

/**
 * @author NMK OPT 1
 *
 */
public interface ERetailAuditService {

	void createAuditlog(AuditLogVO auditLogVO);

	void updateBrand(AuditLogVO auditLogVO);

	void deleteAuditlog(int id);

	AuditLogVO getAuditlogByIdx(int id);

	ResponseEntity<String> getAllAuditLog();

	public List<AuditLog> test();

}
