package com.sk.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto extends BaseDto {
	private String Course;
	public StudentDto() {
		System.out.println("StudentDto::0-param constructor");
	}
}
