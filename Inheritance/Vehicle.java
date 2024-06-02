package com.FlynautSaaS.Inheritance;
public abstract class Vehicle
{
	private String color;
	private String make;
	private String model;
	private int year;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	public Vehicle(String color, String make, String model, int year) {
		super();
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public abstract void info();
}
