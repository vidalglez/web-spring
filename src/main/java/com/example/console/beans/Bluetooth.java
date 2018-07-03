package com.example.console.beans;

public class Bluetooth {
	
	private boolean enabled;
	
	public String enable() {
		enabled = true;
		return "Blutooth system enabled: " + enabled;
	}
	
	public String disable() {
		enabled = false;
		return "Blutooth system enabled: " + enabled;
	}
	
	

}
