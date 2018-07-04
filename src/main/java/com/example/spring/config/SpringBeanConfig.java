package com.example.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.console.beans.Controllable;
import com.example.console.beans.RemoteControl;
import com.example.spring.beans.AppleTV;

@Configuration
public class SpringBeanConfig {
	
	@Bean
	public Controllable aControl() {
		return new RemoteControl();
	}

	@Bean
	public AppleTV appleTV () {
		return new AppleTV(aControl());
	}
}
