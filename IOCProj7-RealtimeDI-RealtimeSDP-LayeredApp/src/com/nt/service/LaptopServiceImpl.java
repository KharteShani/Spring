package com.nt.service;

import com.nt.bo.LaptopBO;
import com.nt.dao.LaptopDAOImpl;
import com.nt.dto.LaptopDTO;

public class LaptopServiceImpl implements LaptopService {

	private LaptopDAOImpl dimp = null;

	public LaptopServiceImpl(LaptopDAOImpl dimp) {
		this.dimp = dimp;
		System.out.println("LaptopServiceImpl:: 1-param constructor");
	}

	@Override
	public String register(LaptopDTO dto) throws Exception {

		LaptopBO bo = null;
		// String count=null;
		bo = new LaptopBO();
		bo.setLapname(dto.getLapname());
		bo.setLapprice(dto.getLapprice());
		bo.setLaplength(dto.getLaplength());
		bo.setLapweight(dto.getLapweight());

		if (dto.getLapprice() >= 50000) {
			System.out.println("if laptop is above to 50000" + dto.getLapprice() * 0.01);
			System.out.println("Laptop is So costly But Quality Check one time");
		} else {
			System.out.println("Laptop is not costly thats why compare with another costly laptop");
		}
		 
		dimp.insert(bo);
		return null;
	}

}
