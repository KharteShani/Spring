package com.sk.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sk.controller.MainController;
import com.sk.vo.ClothStoreVo;

public class NestedBeanFactoryTest {

	public static void main(String[] args) {
		BeanFactory pFactory=null,cFactory=null;
		MainController controller=null;
		List<ClothStoreVo> listVO=null;
		//create Parent IOC container
		pFactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/sk/cfgs/Business-bean.xml"));
		//create Child IOC container
		cFactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/sk/cfgs/Presentation-Beans.xml"),pFactory);
		//get Controller class obj
		controller=cFactory.getBean("controller",MainController.class);
		try {
		//invoke method
		listVO=controller.showClothBrand("MUFTI", "CHANEL");
		System.out.println("ClothCenter having");
			for(ClothStoreVo vo:listVO) {
			System.out.println(vo);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}
