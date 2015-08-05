package com.project.rms.vehicle;

public class Car extends Vehicle
{

	public Car(){
		super();
	}
	
	public Car(String vId, String vModel, int vYear, String vIn, Seats description, VehicleType vehicleType,
			VehicleState vehicleState, String vHealth, VehicleState vehicleState2) {
		// TODO Auto-generated constructor stub
		
		this.vId = vId;
		this.vModel = vModel;
		this.vYear = vYear;
		this.vIn = vIn;
		this.description = description;
		this.vehicleType = vehicleType;
		this.vehicleState = vehicleState;
		this.vHealth = vHealth;
		this.vehicleState = vehicleState2;
	}

	public int cost() {
		// TODO implement me
		return 5;
	}
	
	public String getFeatureDescription() {
		return "Car";
	}
	
}

