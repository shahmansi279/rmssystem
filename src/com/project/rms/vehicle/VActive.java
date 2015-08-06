package com.project.rms.vehicle;

public class VActive implements VehicleState
{
	
	public Vehicle vehicle;
	
	public VActive(){
		super();
	}
	
	public void doAction(Vehicle vehicle){
		System.out.println("Vehicle is in active state");
		vehicle.setVehicleState(this);
		
      }
}
	

