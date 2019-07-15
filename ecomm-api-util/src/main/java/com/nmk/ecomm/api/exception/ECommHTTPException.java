package com.nmk.ecomm.api.exception;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * for HTTP 400 Bad Request errors
 */

@XmlRootElement(name = "error")
public class ECommHTTPException {
	/*
	 * private String messageType;
	 */
	private String messageCode;
	private List<String> messageDetails;
	private int statusCode;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeStamp;

	/*
	 * public String getMessageType() { return messageType; } public void
	 * setMessageType(String messageType) { this.messageType = messageType; }
	 */
	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(final String messageCode) {
		this.messageCode = messageCode;
	}

	public List<String> getMessageDetails() {
		return messageDetails;
	}

	public void setMessageDetails(final List<String> messageDetails) {
		this.messageDetails = messageDetails;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(final int statusCode) {
		this.statusCode = statusCode;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(final Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	/*
	 * public BrandErrorModel(String messageType, String messageCode, List<String>
	 * messageDetails, int statusCode, Date timeStamp) { super(); this.messageType =
	 * messageType; this.messageCode = messageCode; this.messageDetails =
	 * messageDetails; this.statusCode = statusCode; this.timeStamp = timeStamp; }
	 */
	public ECommHTTPException(final String messageCode, final List<String> messageDetails, final int statusCode,
			final Date timeStamp) {
		super();
		this.messageCode = messageCode;
		this.messageDetails = messageDetails;
		this.statusCode = statusCode;
		this.timeStamp = timeStamp;
	}

}
