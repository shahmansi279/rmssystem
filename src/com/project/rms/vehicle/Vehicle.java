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
	public String vHealth;

	public Vehicle(){
		vehicleState = new VPending(this);
	}
	
	/*public void addVehicle(){
		System.out.println(vehicleState.addVehicle());
	}
	
	public void activeVehicle() {
		System.out.println(vehicleState.activeVehicle());
	}*/
	
	public void setVehicleState(VehicleState vs) {
		vehicleState = vs;	
	}
	
	public VehicleState getVehicleState() {
		return vehicleState;	
	}
	
	public void setVehicleType(VehicleType vt) {
		// TODO implement me	
		vehicleType = vt;
	}
	
	public VehicleType getVehicleType() {
		return vehicleType;	
	}
	
	public void decorateVehicle() {
		// TODO implement me	
	}
	
	public abstract int cost();
	public abstract String getFeatureDescription();
	
}
