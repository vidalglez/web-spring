package com.example.inject.beans;

import org.springframework.stereotype.Component;

@Component
public class Sword implements Plugable{

	public String plug() {
		return "Sword has been plugged into figure";
	}
}
