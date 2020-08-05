package com.sk.service;

import java.util.List;

import com.sk.dto.ClothCenterDto;

public interface ClothCenterService {
	
	public List<ClothCenterDto> fetchClothByBrand(String brand1,String brand2) throws Exception;
}
