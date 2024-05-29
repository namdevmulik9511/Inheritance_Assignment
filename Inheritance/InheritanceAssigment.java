package com.FlynautSaaS.Inheritance;

public class InheritanceAssigment {

	public static void main(String[] args)
	{
		// for car
		Vehicle vehicleCar=new Car("Red","Honda","Honda Amaze",2004,4," Manual & Automatic transmission");
		vehicleCar.info();

		// for truck
		Vehicle vehicleTruck=new Truck("Black","TATA","TATA Prima",2018,"Large",55000);
		vehicleTruck.info();

		// for electric car
		Car electricCar=new ElectricCar("White","TATA","punch.ev",2023,4,"Manual","25 to 25KW", "315 to 421km");
		electricCar.info();
		((ElectricCar) electricCar).fuelUse();
	
		// for Gasoline Car
		Car gasolineCar=new GasolineCar("Gray","BMW","BMW 35",2024,2,"Manual & Automatic",5,40);
		gasolineCar.info();
		((GasolineCar) gasolineCar).fuelUse();
		


	}

}
