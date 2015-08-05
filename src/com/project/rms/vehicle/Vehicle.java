package com.project.rms.vehicle;

public abstract class Vehicle
{
	
	public String vId;
	public String vModel;
	//public VehicleType vType;
	public int vYear;
	public String vIn;
	public Seats description;
	public String vehicleType;
	public VehicleState vehicleState;
	public String vHealth;
	
	public Vehicle(){
		
		vehicleState = new VPending(this);
		
		/*this.vId = id;
		this.vModel = model;
		this.vYear = year;
		this.vIn = vin;
		this.description = desc;
		this.vehicleType = type;
		this.vehicleState = state;
		this.vHealth = health;*/
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


	public int getvYear() {
		return vYear;
	}


	public void setvYear(int vYear) {
		this.vYear = vYear;
	}


	public String getvIn() {
		return vIn;
	}


	public void setvIn(String vIn) {
		this.vIn = vIn;
	}


	public Seats getDescription() {
		return description;
	}


	public void setDescription(Seats description) {
		this.description = description;
	}


	public String getvHealth() {
		return vHealth;
	}


	public void setvHealth(String vHealth) {
		this.vHealth = vHealth;
	}
	
	
	
	public void setVehicleState(VehicleState vs) {
		vehicleState = vs;	
	}
	
	public VehicleState getVehicleState() {
		return vehicleState;	
	}
	
	public void setVehicleType(String vt) {
		// TODO implement me	
		vehicleType = vt;
	}
	
	public String getVehicleType() {
		return vehicleType;	
	}
	
	public void decorateVehicle() {
		// TODO implement me	
	}
	
	public abstract int cost();
	public abstract String getFeatureDescription();
	
}
