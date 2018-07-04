package com.example.console;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.beans.AppleTV;
import com.example.spring.config.SpringBeanConfig;

public class SpringJavaConfigApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringBeanConfig.class);
		AppleTV myAppleTV =  ctx.getBean("appleTV", AppleTV.class);
		
		System.out.println(myAppleTV.turnOn());
		System.out.println(myAppleTV.enableBluetooth(true));
		System.out.println(myAppleTV.useControl());
		System.out.println(myAppleTV.play());
		
		ctx.close();

	}

}
