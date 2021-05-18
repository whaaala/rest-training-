package org.java.showroom.services;

import java.util.List;

import org.java.showroom.hibernate.DAO.BrandsDAO;
import org.java.showroom.hibernate.entities.BrandEntity;


public class BrandsService {

	BrandsDAO dao = new BrandsDAO();

	public List<BrandEntity> getBrands() {
		List<BrandEntity> list = dao.getBrands();
		return list;
	}

	public void addBrand(BrandEntity brand) {
		dao.addBrand(brand);
		
	}

	public void updateBrand(BrandEntity updatedBrand) {
		dao.updateBrand(updatedBrand);
		
	}

	public void deleteBrand(int brandId) {
		dao.deleteBrand(brandId);
	}

}
