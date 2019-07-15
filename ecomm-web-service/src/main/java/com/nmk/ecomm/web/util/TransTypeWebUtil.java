package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.TransType;
import com.nmk.ecomm.web.vo.TransTypeVO;

/**
 * @author NMK OPT 1
 *
 */
public class TransTypeWebUtil {
	public static TransType convertTransTypeVOObjectToTransType(final TransTypeVO transTypeVO) {
		final TransType transType = new TransType();
		try {
			BeanUtils.copyProperties(transType, transTypeVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return transType;
	}

	public static TransTypeVO convertTransTypeToTransTypeVO(final TransType transType) {
		final TransTypeVO transTypeVO = new TransTypeVO();
		try {
			BeanUtils.copyProperties(transTypeVO, transType);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return transTypeVO;
	}

	public static List<TransTypeVO> convertTransTypeListToTransTypeVOList(final List<TransType> transactions) {
		final List<TransTypeVO> transTypeList = new ArrayList<TransTypeVO>();
		try {
			for (final TransType transType : transactions) {
				final TransTypeVO transTypeVO = new TransTypeVO();
				BeanUtils.copyProperties(transTypeVO, transType);
				transTypeList.add(transTypeVO);
			}
		} catch (IllegalAccessException e) {
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return transTypeList;
	}
}
