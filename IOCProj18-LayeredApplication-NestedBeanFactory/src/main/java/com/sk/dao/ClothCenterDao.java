package com.sk.dao;

import java.util.List;

import com.sk.bo.ClothCenterBo;

public interface ClothCenterDao {
	public List<ClothCenterBo> getClothsByBrand(String brand1,String brand2) throws Exception;
}
