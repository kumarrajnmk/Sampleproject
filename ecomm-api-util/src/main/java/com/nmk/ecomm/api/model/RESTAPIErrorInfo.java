package com.nmk.ecomm.api.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement
public class RESTAPIErrorInfo {
	public final String errorDetail;
	public final String errorMessage;

	public RESTAPIErrorInfo(final Exception ex, final String detail) {
		this.errorMessage = ex.getLocalizedMessage();
		this.errorDetail = detail;
	}
}