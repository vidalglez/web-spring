package com.example.inject.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("figure")
public class ActionFigure {
	
	@Autowired
	@Qualifier("accesory")
	private Plugable plugItem;
	
	private Sword sword;	
	
	private Base base;
	
	@Value("${action.figure}")
	private String name;
	
	@Autowired
	public ActionFigure(Sword sword) {
		this.sword = sword;
	}
	
	public ActionFigure(Plugable plug) {
		this.plugItem = plug;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Autowired
	public void createBase(Base base) {
		System.out.println("Setter - Method Injection for base, invoked directly by spring through @Autowired");
		this.base = base;
	}
	
	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	public String plugSword() {
		return sword.plug();
	}
	
	public String plugItem() {
		return plugItem.plug();
	}

}
