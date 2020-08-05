package com.sk.bo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentBo extends BaseBo {
	private String Course;
	public StudentBo() {
		System.out.println("StudentBo:: 0-param constructor");
	}
	
}
