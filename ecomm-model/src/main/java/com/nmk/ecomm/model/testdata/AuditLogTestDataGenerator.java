package com.nmk.ecomm.model.testdata;

import java.util.ArrayList;
import java.util.List;

import com.nmk.ecomm.model.AuditLog;

/**
 * @author NMK OPT 1
 *
 */
public abstract class AuditLogTestDataGenerator {
	static List<AuditLog> auditLogList = new ArrayList<AuditLog>();
	static {
		final AuditLog auditLog1 = new AuditLog(1, "gd", "ghae");
		auditLog1.setIdx(1);

		final AuditLog auditLog2 = new AuditLog(2, "dg", "ghf");
		auditLog2.setIdx(2);

		final AuditLog auditLog3 = new AuditLog(1, "dd", "gef");
		auditLog3.setIdx(3);

		final AuditLog auditLog4 = new AuditLog(1, "d", "ghef");
		;
		auditLog4.setIdx(4);

		final AuditLog auditLog5 = new AuditLog(1, "d", "gaef");
		;
		auditLog5.setIdx(5);

		auditLogList.add(auditLog1);
		auditLogList.add(auditLog2);
		auditLogList.add(auditLog3);
		auditLogList.add(auditLog4);
		auditLogList.add(auditLog5);
	}

	public static List<AuditLog> getAllUsers() {

		return auditLogList;
	}

}
