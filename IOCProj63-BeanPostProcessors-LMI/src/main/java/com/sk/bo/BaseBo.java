package com.sk.bo;

import java.util.Date;

import lombok.Data;
@Data
public abstract class BaseBo {
	private int id;
	private String name;
	private String address;
	private Date doj;
}
