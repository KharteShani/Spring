package com.sk.dto;

import java.util.Date;

import lombok.Data;
@Data
public abstract class BaseDto  {
	private int id;
	private String name;
	private String address;
	private Date doj;
}
