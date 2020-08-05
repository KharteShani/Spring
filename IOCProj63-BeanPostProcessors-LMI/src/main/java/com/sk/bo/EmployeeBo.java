package com.sk.bo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class EmployeeBo extends BaseBo {
	private String qlfy;
	public EmployeeBo() {
		System.out.println("EmployeeBo:: 0-param constructor");
	}
	
}
