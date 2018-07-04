package com.example.spring.beans;

import com.example.console.beans.Controllable;
import com.example.console.beans.Playable;

public class AppleTV  implements Playable{
	
	private Controllable control;
	
	public AppleTV(Controllable control) {
		this.control = control;
	}

	@Override
	public String play() {		
		return "Playing AppleTV IOS interface";
	}

	@Override
	public String turnOn() {		
		return "AppleTV is turned on";
	}

	@Override
	public String enableBluetooth(boolean enabled) {
		return "AppleTV is enabled for bluetooth " + enabled;
	}
	
	public String useControl() {
		return control.turnOn();
	}
	

}
