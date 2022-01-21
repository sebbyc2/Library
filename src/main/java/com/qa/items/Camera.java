package com.qa.items;

import com.qa.Interfaces.ElectronicDevice;

public class Camera extends LibraryItem implements ElectronicDevice {

	private String brand;
	private String model;
	private int fieldOfView;
	private String lenses;
	private double shutterSpeed;

	public Camera(String brand, String model, int fee, int fieldOfView, String lenses, double shutterSpeed) {
		super((brand + " " + model), fee);
		this.setBrand(brand);
		this.setModel(model);
		this.setFieldOfView(fieldOfView);
		this.setLenses(lenses);
		this.setShutterSpeed(shutterSpeed);
	}

	@Override
	public String toString() {
		return "Camera [fieldOfView=" + fieldOfView + ", shutterSpeed=" + shutterSpeed + ", lenses=" + lenses
				+ ", brand=" + brand + ", getIsBorrowed()=" + getIsBorrowed() + "]";
	}

	public void throwIt() {
		System.out.println("Camera is Broken");
	}

	public void turnOn() {
		// method body modcheck
	}

	public void turnOff() {
		// method body modcheck
	}

	public void status() {
		// method body modcheck
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getFieldOfView() {
		return fieldOfView;
	}

	public void setFieldOfView(int fieldOfView) {
		this.fieldOfView = fieldOfView;
	}

	public String getLenses() {
		return lenses;
	}

	public void setLenses(String lenses) {
		this.lenses = lenses;
	}

	public double getShutterSpeed() {
		return shutterSpeed;
	}

	public void setShutterSpeed(double shutterSpeed) {
		this.shutterSpeed = shutterSpeed;
	}
}
