package com.project.rms.vehicle;

public class Car extends Vehicle
{

	public Car(){
		super();
	}
	
	public Car(String vId, String vModel, String vYear, String vIn, int vehicleType,
			VehicleState vehicleState, int vHealth) {
		// TODO Auto-generated constructor stub
		
		this.vId = vId;
		this.vModel = vModel;
		this.vYear = vYear;
		this.vIn = vIn;
		this.vehicleType = vehicleType;
		this.vehicleState = vehicleState;
		this.vHealth = vHealth;
	}

	public int cost() {
		// TODO implement me
		return 5;
	}
	
	public String getFeatureDescription() {
		return "Car";
	}
	
}

