package com.project.rms.vehicle;


public abstract class Vehicle
{
	
	public String vId;
	public String vModel;
	public VehicleType vType;
	public int vYear;
	public String vIn;
	public Seats description;
	public VehicleType vehicleType;
	public VehicleState vehicleState;

	public Vehicle(){
		vehicleState = new VPending(this);
	}
	
	public void addVehicle(){
		System.out.println(vehicleState.addVehicle())
	}
	
	public void activeVehicle() {
		System.out.println(vehicleState.activeVehicle())
	}
	
	public void setVehicleState(vehicleState vs) {
		vehicleState = vs;	
	}
	
	public vehicleState getVehicleState() {
		return vehicleState;	
	}
	
	public void setVehicleType() {
		// TODO implement me	
	}
	
	public void decorateVehicle() {
		// TODO implement me	
	}
	
	public abstract void cost() {
	
	}
	
	public String getFeatureDescription();
	
}
