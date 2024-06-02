package com.FlynautSaaS.Inheritance;
public class Truck extends Vehicle 
{
	private String bedSize;
	private int towingCapacity;
	public Truck(String color, String make, String model, int year, String bedSize, int towingCapacity)
	{
		super(color, make, model, year);
		this.bedSize = bedSize;
		this.towingCapacity = towingCapacity;
	}
	public String getBedSize() {
		return bedSize;
	}
	public void setBedSize(String bedSize) {
		this.bedSize = bedSize;
	}
	public int getTowingCapacity() {
		return towingCapacity;
	}
	public void setTowingCapacity(int towingCapacity) {
		this.towingCapacity = towingCapacity;
	}
	@Override
	public void info() 
	{
		System.out.println("Truck Information");
		System.out.println("Truck Color : "+getColor()+" Truck Make : "+getMake()+" Truck Model : "+getModel()
		+" Truck Year : "+getYear()+" Truck bedSize : "+bedSize+" Truck TowingCapacity : "+towingCapacity);
	}
}
