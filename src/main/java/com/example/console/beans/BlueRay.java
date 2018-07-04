package com.example.console.beans;

public class BlueRay implements Playable{
	
	private RemoteControl control;	
	private Bluetooth bluetoothSystem;
	private String brand;
	private String typeReproducer;
	private String operativeSystem;
	
	public BlueRay(RemoteControl control) {
		this.control = control;
	}

	public String play() {
		return "Blueray disc is being played";
	}
	
	public String turnOn() {
		return control.turnOn();
	}

	public Bluetooth getBluetoothSystem() {
		return bluetoothSystem;
	}

	public void setBluetoothSystem(Bluetooth bluetoothSystem) {
		this.bluetoothSystem = bluetoothSystem;
	}
	
	public String enableBluetooth(boolean enabled) {
		return enabled ? bluetoothSystem.enable() : bluetoothSystem.disable();
	}

	public String getBrand() {
		return brand;
	}

	public String getTypeReproducer() {
		return typeReproducer;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setTypeReproducer(String typeReproducer) {
		this.typeReproducer = typeReproducer;
	}

	public String getOperativeSystem() {
		return operativeSystem;
	}

	public void setOperativeSystem(String operativeSystem) {
		this.operativeSystem = operativeSystem;
	}
}
