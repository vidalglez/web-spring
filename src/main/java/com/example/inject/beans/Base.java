package com.example.inject.beans;

import org.springframework.stereotype.Component;

@Component
public class Base implements Plugable, Rotable{

	@Override
	public String plug() {
		return "Base has been plugged";
	}
	
	@Override
	public String rotate() {
		return "Base has been rotated 90 degrees";
	}
}
