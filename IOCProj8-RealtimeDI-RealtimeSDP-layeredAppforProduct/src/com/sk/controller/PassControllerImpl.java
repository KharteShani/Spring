package com.sk.controller;

import com.sk.dto.PassDTO;
import com.sk.service.PassService;
import com.sk.vo.PassVO;

public class PassControllerImpl implements PassController {
	private PassService service;

	public PassControllerImpl(PassService service) {
		System.out.println("PassControllerImpl:1-param constructor");
		this.service = service;
	}
	
	@Override
	public String processTicket(PassVO vo) throws Exception {
		String result;
		PassDTO dto=null;
		//create a Business class object
		dto=new PassDTO();
		//converting the vo inputs dto inputs
		dto.setTicketno(Integer.parseInt(vo.getTicketno()));
		dto.setPassname(vo.getPassname());
		dto.setPassaddress(vo.getPassaddress());
		dto.setPassage(Integer.parseInt(vo.getPassage()));
		dto.setSourceplace(vo.getSourceplace());
		dto.setDestplace(vo.getDestplace());
		
		result=service.registerTicket(dto);
		return null;
	}

}
