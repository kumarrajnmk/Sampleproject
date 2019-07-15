package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.Brand;
import com.nmk.ecomm.web.vo.BrandVO;

/**
 * @author NMK OPT 1
 *
 */
public class BrandWebUtil {
	public static Brand convertBrandVOObjectToBrand(final BrandVO brandVO) {
		final Brand brand = new Brand();
		try {
			BeanUtils.copyProperties(brand, brandVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return brand;
	}

	public static BrandVO convertBrandToBrandVO(final Brand brand) {
		final BrandVO brandVO = new BrandVO();
		try {
			BeanUtils.copyProperties(brandVO, brand);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return brandVO;
	}

	public static List<BrandVO> convertBrandListToBrandVOList(final List<Brand> brands) {
		final List<BrandVO> brandList = new ArrayList<BrandVO>();
		try {
			for (Brand brand : brands) {
				BrandVO brandVO = new BrandVO();
				BeanUtils.copyProperties(brandVO, brand);
				brandList.add(brandVO);
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return brandList;
	}
}
