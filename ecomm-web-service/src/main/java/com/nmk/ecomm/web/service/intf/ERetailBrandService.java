package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.model.Brand;
import com.nmk.ecomm.web.vo.BrandVO;

/**
 * @author NMK OPT 1
 *
 */
public interface ERetailBrandService {

	BrandVO getBrandByIdx(int id);

	List<BrandVO> getAllBrands();

	void createBrand(BrandVO brandVO);

	void updateBrand(BrandVO brandVO);

	void deleteBrand(int id);

	List<Brand> test();

}
