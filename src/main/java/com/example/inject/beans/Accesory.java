package com.example.inject.beans;

import org.springframework.stereotype.Component;

@Component
public class Accesory implements Plugable, Rotable{

	@Override
	public String rotate() {		
		return "Accesory has been rotated";
	}

	@Override
	public String plug() {
		return "Accesory has been plugged";
	}

}
