package com.FlynautSaaS.Inheritance;

public class ElectricCar extends Car implements Fuel
{
	private  String batteryCapacity;
	private String range;
	
	public ElectricCar(String color, String make, String model, int year, int numDoors, String transmissionType,
			String batteryCapacity, String range) 
	{
		super(color, make, model, year, numDoors, transmissionType);
		this.batteryCapacity = batteryCapacity;
		this.range = range;
	}
	@Override
	public void info()
	{ 
		System.out.println("Car Information");
		System.out.println("ElectricCar Color: " + getColor()+" ElectricCar Make : " + getMake()+"ElectricCar Model : "
		+ getModel()+" ElectricCar Year: " + getYear()+" ElectricCar Number of Doors: " + getNumDoors()+" ElectricCar Transmission Type: " + getTransmissionType()
				+" ElectricCar Battery Capacity : "+batteryCapacity+" ElectricCar Range"+ range);
		
	}
	@Override
	public void fuelUse()
	{
		System.out.println("Electric Battery");
		
	}

}
