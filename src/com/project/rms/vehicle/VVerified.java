package com.project.rms.vehicle;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class VVerified implements VehicleState
{
	
	public Vehicle vehicle;
	
	public VVerified(){
		super();
	}
	
	public void doAction(Vehicle vehicle){
		System.out.println("Vehicle request is in verified state");
		vehicle.setVehicleState(this);
		
        if (vehicle.vehicleType == 1){
        	//contractor owned
        	VActive va = new VActive();
        	vehicle.setVehicleState(new VActive());
			va.doAction(vehicle);
      }
        else if(vehicle.vehicleType == 2){
        	//company owned
        	VAcquiring va = new VAcquiring();
        	vehicle.setVehicleState(new VAcquiring());
			va.doAction(vehicle);
    	  
      }
        
	}

	
}