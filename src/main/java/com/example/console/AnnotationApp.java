package com.example.console;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.inject.beans.ActionFigure;

public class AnnotationApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ActionFigure figure = ctx.getBean("figure", ActionFigure.class);
		ActionFigure figure2 = ctx.getBean("figure", ActionFigure.class);
		
		boolean isTheSame = figure == figure2;
		System.out.println("Verifying scope for action figure objects which both instances are the same - figure == figure2: " + isTheSame);
		System.out.println("figure: " + figure + ",\nfigure2: " + figure2);
		
		System.out.println("Component Scan Annotations example");
		System.out.println("Action figure name: " + figure.getName());		
		System.out.println(figure.plugSword());
		System.out.println(figure.getBase().plug());
		System.out.println(figure.getBase().rotate());
		System.out.println(figure.plugItem());
		
		ctx.close();
	}

}
