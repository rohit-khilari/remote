package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class Main_setter_based {

	public static void main(String[] args) {
		 ApplicationContext ap = new ClassPathXmlApplicationContext("com/config/config.xml");
	Person  p1 = ap.getBean("p",Person. class);

	//System.out.println(p1.getPname());
	//System.out.println(p1.getContact());
	//System.out.println(p1.getEmail());
	//System.out.println(p1.getAddress());
	
	
	System.out.println(p1.getPid());
	
	System.out.println(p1.getPname());
	
	p1.getContact().forEach(b ->{
		System.out.println(b);
	});
	
	p1.getEmail().forEach(c ->{
		System.out.println(c);
	});
	
	p1.getAddress().forEach((k,v) ->{
		System.out.println(k+ "=> " +v);
	});
	
	
		}
}
