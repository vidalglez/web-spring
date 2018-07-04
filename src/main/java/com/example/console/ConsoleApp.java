package com.example.console;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.console.beans.BlueRay;
//import com.example.console.beans.Playable;

public class ConsoleApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		BlueRay blueRay = ctx.getBean("blueRay", BlueRay.class);
		System.out.println("Your blueray brand is " + blueRay.getBrand() + " and reproduces " + blueRay.getTypeReproducer() + 
				" and operative system is: " + blueRay.getOperativeSystem());
		System.out.println("Turn on device: " + blueRay.turnOn());
		System.out.println("Turn on bluetooth: " + blueRay.enableBluetooth(true));
		System.out.println("Play movie: " + blueRay.play());
		
		ctx.close();

	}

}
