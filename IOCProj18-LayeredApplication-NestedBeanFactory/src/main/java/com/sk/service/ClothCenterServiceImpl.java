package com.sk.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.sk.bo.ClothCenterBo;
import com.sk.dao.ClothCenterDao;
import com.sk.dao.ClothCenterDaoImpl;
import com.sk.dto.ClothCenterDto;

@Service("clothService")
public class ClothCenterServiceImpl implements ClothCenterService{
	
	private ClothCenterDao dao;
    
	public ClothCenterServiceImpl(ClothCenterDao dao) {
		this.dao=dao;
	}
	@Override
	public List<ClothCenterDto> fetchClothByBrand(String brand1, String brand2) throws Exception {
		List<ClothCenterBo> listBo=null;
		List<ClothCenterDto> listDto=null;
		ClothCenterDto dto=null;
		//use DAO
		listBo=dao.getClothsByBrand(brand1, brand2);
		//convert listDto to listBo
		listDto=new ArrayList();
		for(ClothCenterBo bo:listBo) {
			dto=new ClothCenterDto();
			BeanUtils.copyProperties(bo,dto);
			dto.setStoreno(listDto.size()+1);
			listDto.add(dto);
		}
		return listDto;
	}
}
