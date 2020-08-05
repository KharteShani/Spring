package com.sk.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto extends BaseDto{
	private String qlfy;
    public EmployeeDto() {
		System.out.println("EmployeeDto::0-param constructor");
	}
	
}
