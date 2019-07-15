package com.nmk.ecomm.api.client;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nmk.ecomm.model.AuditLog;

@RestController
public class AuditlogServiceClient {

	@Autowired
	static RestTemplate restTemplate = new RestTemplate();
	static String auditlogSeriviceURL = "http://localhost:8081/api/v1/auditlog";
	private static final Logger logger = LoggerFactory.getLogger(AuditlogServiceClient.class);

	
	public static AuditLog getAuditlogByIdx(int id) {
		logger.debug("Start  :AuditlogServiceClient .getAuditlogByIdx() ");

		AuditLog auditlog = restTemplate.getForObject(auditlogSeriviceURL + "/" + id, AuditLog.class);
		System.out.println(auditlog.getIdx() + " " + auditlog.getDescription() + " " + auditlog.getXmlMsg() + " "
				+ auditlog.getTransTypeIdx() + " " + auditlog.getCreatedBy() + " " + auditlog.getCreateDate() + " "
				+ auditlog.getModifiedBy() + " " + auditlog.getModifiedDate());
		logger.debug("Start  : AuditlogServiceClient .getAuditlogByIdx() ");

		return auditlog;
	}

	public static AuditLog getAllAuditLog() {
		logger.debug("Start  :AuditlogServiceClient .getAllAuditLog() ");

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(auditlogSeriviceURL, HttpMethod.GET, entity,
				String.class);
		logger.debug("Start  : AuditlogServiceClient .getAllAuditLog() ");

		System.out.println(result);
		return null;
	}

	public static void deleteAuditlog(int id) {
		logger.debug("Start  :AuditlogServiceClient .deleteAuditlog() ");

		restTemplate.delete(auditlogSeriviceURL + "/" + id);
		logger.debug("Start  : AuditlogServiceClient .deleteAuditlog() ");

	}

	public static void createAuditlog(AuditLog auditlog) {
		logger.debug("Start  : AuditlogServiceCliente .createAuditlog() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<AuditLog> request = new HttpEntity<AuditLog>(auditlog);
		ResponseEntity<AuditLog> response = restTemplate.exchange(auditlogSeriviceURL, HttpMethod.POST, request,
				AuditLog.class);
		logger.debug("Start  : AuditlogServiceClient .createAuditlog() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("AuditLog Data Inserted Successfully");
	}

	public static void updateBrand(AuditLog auditlog) {
		auditlogSeriviceURL = "http://localhost:8081/api/v1/auditlog/135";
		logger.debug("Start  : AuditlogServiceClient .updateBrand() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<AuditLog> request = new HttpEntity<AuditLog>(auditlog);
		ResponseEntity<AuditLog> response = restTemplate.exchange(auditlogSeriviceURL, HttpMethod.PUT, request,
				AuditLog.class);
		logger.debug("Start  :AuditlogServiceClient .updateBrand() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("AuditLog Data Updated Successfully");
	}

	public static void main(String[] args) {
		// We should use these for above methods
		// AuditLog auditlog = new AuditLog("Acer10", "Satish2", 255, "rajdgsg", new
		// java.util.Date(), "asdsaddgs", new java.util.Date());
		// updateBrand(auditlog);
		// createAuditlog(auditlog);
		// AuditLog auditlog = getAuditlogByIdx(135);
		// AuditLog auditlog =getAllAuditLog();
		// AuditLog auditlog = new AuditLog();
		// deleteAuditlog(2);
	}

	public static List<AuditLog> getall() {
		// TODO Auto-generated method stub
		return null;
	}
}
