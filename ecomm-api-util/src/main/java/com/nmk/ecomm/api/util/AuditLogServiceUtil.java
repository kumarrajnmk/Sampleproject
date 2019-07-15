package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.AuditLog;
import com.nmk.ecomm.service.entity.EcommAuditLog;

/**
 * @author NMK OPT 1
 *
 */
public class AuditLogServiceUtil {
	public static AuditLog convertEcommAuditLogObjectToAuditLog(final EcommAuditLog ecommAuditLog) {
		final AuditLog auditlog = new AuditLog();
		try {
			BeanUtils.copyProperties(auditlog, ecommAuditLog);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return auditlog;
	}

	public static EcommAuditLog convertAuditLogToEcommAuditLog(final AuditLog auditlog) {
		final EcommAuditLog ecommAuditLog = new EcommAuditLog();
		try {
			BeanUtils.copyProperties(ecommAuditLog, auditlog);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommAuditLog;
	}

	public static List<AuditLog> convertEcommAuditLogListToAuditLog(final List<EcommAuditLog> ecommAuditLogList) {
		final List<AuditLog> auditlogList = new ArrayList<AuditLog>();
		try {
			for (final EcommAuditLog ecommAuditLog : ecommAuditLogList) {
				final AuditLog auditlog = new AuditLog();
				BeanUtils.copyProperties(auditlog, ecommAuditLog);
				auditlogList.add(auditlog);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return auditlogList;
	}
}
