package com.jiang.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component("ApplicationContextHelper")

public class ApplicationContextHelper{

//	private static ApplicationContext application;
//	
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		// TODO Auto-generated method stub
//		application = applicationContext;
//	}
//
//	
//	public static <T> T popBean(Class<T> clazz) {
//		if (application == null) {
//			
//			return null;
//		}
//		
//		return application.getBean(clazz);
//	}
//	
//	public static <T> T popBean(String name ,Class<T> clazz) {
//		if (application == null) {
//			
//			return null;
//		}
//		
//		return application.getBean(name,clazz);
//	}
	
}
