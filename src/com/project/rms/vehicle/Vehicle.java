package com.project.rms.vehicle;

public abstract class Vehicle
{
	
	public String vId;
	public String vModel;
	public String vYear;
	public String vIn;
	public int vehicleType;
	public VehicleState vehicleState;
	public int vHealth;
	//public String location();
	
	public Vehicle(){
		vehicleState = new VPending();
	}
	
	public String getvId() {
		return vId;
	}


	public void setvId(String vId) {
		this.vId = vId;
	}


	public String getvModel() {
		return vModel;
	}


	public void setvModel(String vModel) {
		this.vModel = vModel;
	}


	public String getvYear() {
		return vYear;
	}


	public void setvYear(String vYear2) {
		this.vYear = vYear2;
	}


	public String getvIn() {
		return vIn;
	}


	public void setvIn(String vIn) {
		this.vIn = vIn;
	}



	public int getvHealth() {
		return vHealth;
	}


	public void setvHealth(int vHealth2) {
		this.vHealth = vHealth2;
	}
	
	public void setVehicleState(VehicleState vs) {
		vehicleState = vs;	
	}
	
	public VehicleState getVehicleState() {
		return vehicleState;	
	}
	
	public void setVehicleType(int vType) {
		// TODO implement me	
		vehicleType = vType;
	}
	
	public int getVehicleType() {
		return vehicleType;	
	}
	
	public void decorateVehicle() {
		// TODO implement me	
	}
	
	public abstract int cost();
	public abstract String getFeatureDescription();
	
}
