package com.nt.controller;

import com.nt.dto.LaptopDTO;
import com.nt.service.LaptopServiceImpl;
import com.nt.vo.LaptopVO;

public class LaptopControllerImpl implements LaptopController{
	LaptopServiceImpl serimp;
	
	public LaptopControllerImpl(LaptopServiceImpl serimp) {
		this.serimp=serimp;
		System.out.println("LaptopControllerImpl::1-param Constructor");
	}
	
	@Override
	public String control(LaptopVO vo) throws Exception {
		LaptopDTO dto=null;
		dto=new LaptopDTO(); 
		//convert the given String input into related Datatype inside
		dto.setLapname(vo.getLapname());
		dto.setLapprice(Float.parseFloat(vo.getLaprice()));
		dto.setLaplength(Float.parseFloat(vo.getLaplength()));
		dto.setLapweight(Float.parseFloat(vo.getLapweight()));
		serimp.register(dto);
		return null;
	}
}
