package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.Brand;
import com.nmk.ecomm.service.entity.EcommBrand;

/**
 * @author NMK OPT 1
 *
 */
public class BrandServiceUtil {
	public static Brand convertEcommBrandObjectToBrand(final EcommBrand ecommBrand) {
		final Brand brand = new Brand();
		try {
			BeanUtils.copyProperties(brand, ecommBrand);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return brand;
	}

	public static EcommBrand convertBrandToEcommBrand(final Brand brand) {
		final EcommBrand ecommBrand = new EcommBrand();
		try {
			BeanUtils.copyProperties(ecommBrand, brand);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommBrand;
	}

	public static List<Brand> convertEcommBrandListToBrand(final List<EcommBrand> ecommBrandList) {
		final List<Brand> brandList = new ArrayList<Brand>();
		try {
			for (final EcommBrand ecommBrand : ecommBrandList) {
				final Brand brand = new Brand();
				BeanUtils.copyProperties(brand, ecommBrand);
				brandList.add(brand);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return brandList;
	}
}
