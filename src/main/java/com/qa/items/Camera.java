package com.qa.items;

import com.qa.Interfaces.ElectronicDevice;

public class Camera extends LibraryItem implements ElectronicDevice {

	public Camera(String brand, String model, int fee, int fieldOfView, String lenses, double shutterSpeed) {
		super((brand + " " + model), fee);
		this.setBrand(brand);
		this.setFieldOfView(fieldOfView);
		this.setLenses(lenses);
		this.setShutterSpeed(shutterSpeed);

	}

	private int fieldOfView;
	private double shutterSpeed;
	private String lenses;
	private String brand;

	public int getFieldOfView() {
		return fieldOfView;
	}

	public void setFieldOfView(int fieldOfView) {
		this.fieldOfView = fieldOfView;
	}

	public double getShutterSpeed() {
		return shutterSpeed;
	}

	public void setShutterSpeed(double shutterSpeed) {
		this.shutterSpeed = shutterSpeed;
	}

	public String getLenses() {
		return lenses;
	}

	public void setLenses(String lenses) {
		this.lenses = lenses;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public void throwIt() {
	}

	@Override
	public void turnOn() {
		
	}

	@Override
	public void turnOff() {
		
	}

	@Override
	public void status() {
		
	}
}
