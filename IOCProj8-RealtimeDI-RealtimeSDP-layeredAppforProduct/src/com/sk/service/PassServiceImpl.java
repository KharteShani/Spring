package com.sk.service;

import com.sk.bo.PassBO;
import com.sk.dao.PassDAO;
import com.sk.dto.PassDTO;

public class PassServiceImpl implements PassService {
	private PassDAO dao;
	
	public PassServiceImpl(PassDAO dao) {
		System.out.println("PassServiceImpl:: 1-param Constructor");
		this.dao = dao;
	}

	@Override
	public String registerTicket(PassDTO dto) throws Exception {
		int km=25;
		int kmrate=0,rate=0;
		float ticketCharge=0.0f;
		PassBO bo=null;
		int count=0;
		//formula to for per km
		kmrate=2*km;
		
		//create the object of the bo class
		bo=new PassBO();
		
		bo.setTicketno(dto.getTicketno());
		bo.setPassname(dto.getPassname());
		bo.setPassage(dto.getPassage());
		bo.setPassaddress(dto.getPassaddress());
		bo.setSourceplace(dto.getSourceplace());
		bo.setDestplace(dto.getDestplace());
		
		if(bo.getPassage()<10||bo.getPassage()>60) {
			ticketCharge=kmrate*50/100;
			bo.setTicketCharge(ticketCharge);
		//	bo.setPassValidation(valid);
		}
		else {
			ticketCharge=kmrate;
			bo.setTicketCharge(ticketCharge);
			//bo.setPassValidation(valid);
		}
	//	bo.setPassValidation(Invalid);
		count=dao.insert(bo);
		return null;
	}
}
