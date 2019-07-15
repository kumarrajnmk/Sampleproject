package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.AuditLog;
import com.nmk.ecomm.web.vo.AuditLogVO;

/**
 * @author NMK OPT 1
 *
 */
public class AuditWebUtil {
	public static AuditLog convertAuditLogVOObjectToAuditLog(final AuditLogVO auditLogVO) {
		final AuditLog auditLog = new AuditLog();
		try {
			BeanUtils.copyProperties(auditLog, auditLogVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return auditLog;
	}

	public static AuditLogVO convertAuditLogObjectToAuditLogVO(final AuditLog auditLog) {
		AuditLogVO auditLogVO = new AuditLogVO();
		try {
			BeanUtils.copyProperties(auditLogVO, auditLog);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new RuntimeException(e);
		}
		return auditLogVO;
	}

	public static List<AuditLogVO> convertAuditLogListToAuditLogVOList(final List<AuditLog> auditLogs) {
		final List<AuditLogVO> auditLogList = new ArrayList<AuditLogVO>();
		try {
			for (AuditLog auditLog : auditLogs) {
				AuditLogVO auditLogVO = new AuditLogVO();
				BeanUtils.copyProperties(auditLogVO, auditLog);
				auditLogList.add(auditLogVO);
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new RuntimeException(e);
		}
		return auditLogList;
	}

}
