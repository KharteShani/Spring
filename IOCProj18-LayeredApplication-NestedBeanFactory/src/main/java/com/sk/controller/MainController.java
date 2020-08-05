package com.sk.controller;

import java.util.ArrayList;
import java.util.List;

import com.sk.dto.ClothCenterDto;
import com.sk.service.ClothCenterService;
import com.sk.vo.ClothStoreVo;

public class MainController  {
	ClothCenterService service;
	 public MainController(ClothCenterService service) {
		this.service=service;
	 }
	 
	 public List<ClothStoreVo> showClothBrand(String brand1,String brand2)throws Exception{
		List<ClothCenterDto> listDto=null;
		List<ClothStoreVo> listVo=null;
		ClothStoreVo vo=null;
		//use service
		listDto=service.fetchClothByBrand(brand1, brand2);
		//convert listDTO to listVO
		listVo=new ArrayList();
		for(ClothCenterDto dto:listDto){
			vo=new ClothStoreVo();
			vo.setStoreno(String.valueOf(dto.getStoreno()));
			vo.setStorename(dto.getStorename());
			vo.setStoreaddress(dto.getStoreaddress());
			vo.setStorecontactno(String.valueOf(dto.getContactno()));
			vo.setBrandname(dto.getBrandname());
			vo.setPrice(String.valueOf(dto.getPrice()));
			//add each VO class obj to listVO
			listVo.add(vo);
		}
		return listVo;
	 }
	 
}
