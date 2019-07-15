package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.TransType;
import com.nmk.ecomm.service.entity.EcommTransType;

/**
 * @author NMK OPT 1
 *
 */
public class TransactionTypeServiceUtil {
	public static TransType convertEcommTransTypeObjectToTransType(final EcommTransType ecommTransType) {
		final TransType transType = new TransType();
		try {
			BeanUtils.copyProperties(transType, ecommTransType);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return transType;
	}

	public static EcommTransType convertTransTypeToEcommTransType(final TransType transType) {
		final EcommTransType ecommTransType = new EcommTransType();
		try {
			BeanUtils.copyProperties(ecommTransType, transType);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommTransType;
	}

	public static List<TransType> convertEcommTransTypeListToTransType(final List<EcommTransType> ecommTransTypeList) {
		final List<TransType> transTypeList = new ArrayList<TransType>();
		try {
			for (final EcommTransType ecommTransType : ecommTransTypeList) {
				final TransType transType = new TransType();
				BeanUtils.copyProperties(transType, ecommTransType);
				transTypeList.add(transType);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return transTypeList;
	}
}
