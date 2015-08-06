package com.project.rms.vehicle;

public class VAssigned implements VehicleState{
	
public Vehicle vehicle;
	
	public VAssigned(){
		super();
	}
	
	public void doAction(Vehicle vehicle){
		System.out.println("Vehicle is in assigned state");
		vehicle.setVehicleState(this);
		
      }

}
