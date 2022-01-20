package com.qa.items;

public class Camera extends LibraryItem {

	public Camera(String name, int fee, String brand, int fieldOfView, String lenses, double shutterSpeed) {
		super(name, fee);
		this.setBrand(name);
		this.setFieldOfView(fieldOfView);
		this.setLenses(name);
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
}
