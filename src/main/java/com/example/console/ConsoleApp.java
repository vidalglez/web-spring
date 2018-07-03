package com.example.console;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.console.beans.Playable;

public class ConsoleApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Playable blueRay = ctx.getBean("blueRay", Playable.class);
		System.out.println("Current action: " + blueRay.play());
		
		ctx.close();

	}

}
