package com.project.rms.vehicle;

import java.util.Scanner;

public class VActive implements VehicleState
{
	
	public Vehicle vehicle;
	
	public VActive(Vehicle vehicle){
		super();
	}
	
	public void doAction(Vehicle vehicle){
		System.out.println("Vehicle is in active state");
		vehicle.setVehicleState(this);
		
    	  
      }
}
	
	/*public String receiveRequest(){
		vehicle.setVehicleState(new VPending(vehicle));
		return "Vehicle added";
	}
	public String addVehicle(){
		return "Vehicle added";	
	}
	public String activeVehicle() {
		if (vType == "company owned"){
			return "Acquiring vehicle";
			vehicle.setVehicleState(new VAcquiring(vehicle));
		}
		else if (vType == "contractor owned"){
			return "The vehicle is active";
			vehicle.setVehicleState(new VActive(vehicle));
		}
	}
	
	public void updateVehicleState() {
		// TODO implement me	
	}*/
	

