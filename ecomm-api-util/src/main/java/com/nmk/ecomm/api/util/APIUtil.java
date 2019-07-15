package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @author NMK OPT 1
 *
 * @param <Entity>
 * @param <Domain>
 */
public class APIUtil<Entity, Domain> {
	public Domain convertEntitytoDomain(final Entity e) {
		final Domain d = null;
		try {
			BeanUtils.copyProperties(d, e);
		} catch (IllegalAccessException ex) {
			// TODO Auto-generated catch block
			// ex.printStackTrace();
			new RuntimeException(ex);
		} catch (InvocationTargetException ex) {
			// TODO Auto-generated catch block
			// ex.printStackTrace();
			new RuntimeException(ex);
		}
		return d;
	}

	public Entity convertDomaintoEntity(final Domain d) {
		final Entity e = null;
		try {
			BeanUtils.copyProperties(e, d);
		} catch (IllegalAccessException ex) {
			// TODO Auto-generated catch block
			// ex.printStackTrace();
			new RuntimeException(ex);
		} catch (InvocationTargetException ex) {
			// TODO Auto-generated catch block
			// ex.printStackTrace();
			new RuntimeException(ex);
		}
		return e;
	}

	public List<Domain> convertEntityListToUser(final List<Entity> entityList) {
		final List<Domain> domainList = new ArrayList<Domain>();
		try {
			for (final Entity e : entityList) {
				final Domain d = null;
				BeanUtils.copyProperties(d, e);
				domainList.add(d);
			}
		} catch (IllegalAccessException ex) {
			// TODO Auto-generated catch block
			// ex.printStackTrace();
			new RuntimeException(ex);
		} catch (InvocationTargetException ex) {
			// TODO Auto-generated catch block
			// ex.printStackTrace();
			new RuntimeException(ex);
		}
		return domainList;
	}
}
