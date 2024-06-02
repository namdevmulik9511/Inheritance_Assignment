package com.FlynautSaaS.Inheritance;
public class GasolineCar extends Car implements Fuel
{
	private int fuelCapacity;
	private  int mpg;
	public GasolineCar(String color, String make, String model, int year, int numDoors, String transmissionType,
			int fuelCapacity, int mpg)
	{
		super(color, make, model, year, numDoors, transmissionType);
		this.fuelCapacity = fuelCapacity;
		this.mpg = mpg;
	}
	@Override
	public void info()
	{ 
		System.out.println("GasolineCar Information");
		System.out.println("GasolineCar Color: " + getColor()+" GasolineCar Make : " + getMake()+"GasolineCar Model : "
		+ getModel()+" GasolineCar Year: " + getYear()+" GasolineCar Number of Doors: " + getNumDoors()+" GasolineCar Transmission Type: " + getTransmissionType()
		+" GasolineCar Fuel Capacity : "+fuelCapacity+" GasolineCar Mag : "+mpg);	
	}
	@Override
	public void fuelUse() 
	{
		System.out.println("CNG gas");	
	}
}
