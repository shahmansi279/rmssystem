package com.project.rms.vehicle;

public class Car extends Vehicle
{

	public Car(){
		super();
	}
	
	public Car(String vId, String vModel, String vYear, String vIn, int vehicleType, int vHealth, String vDriver,String location) {
		// TODO Auto-generated constructor stub
		
		this.vId = vId;
		this.vModel = vModel;
		this.vYear = vYear;
		this.vIn = vIn;
		this.vehicleType = vehicleType;
		this.vHealth = vHealth;
		this.vDriver = vDriver;
		this.location = location;
	}

	public int cost() {
		// TODO implement me
		return 5;
	}
	
	public String getFeatureDescription() {
		return "Car";
	}
	
}

