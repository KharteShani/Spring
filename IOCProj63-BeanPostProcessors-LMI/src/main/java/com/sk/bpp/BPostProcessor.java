package com.sk.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.sk.bo.BaseBo;

public class BPostProcessor implements BeanPostProcessor{
	
	public BPostProcessor() {
		System.out.println("BPP:: 0-param processor");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean,String bid) throws BeansException{
		System.out.println("BPostProcessor.postProcessBeforeInitialization(-,-)");
		return bean;
	}
	
	@Override 
	public Object postProcessAfterInitialization(Object bean,String bid)throws BeansException {
		System.out.println("BPostProcessor.postProcessAfterInitialization(-,-)");
		if(bean instanceof BaseBo) {
			System.out.println(bid);
			((BaseBo) bean).setDoj(new Date());	
		}
		return bean;
	}
}		

