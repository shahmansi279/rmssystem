package com.project.rms.vehicle;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class VPending implements VehicleState
{
	
	public Vehicle vehicle;
	
	public VPending(){
		super();
	}

	public void doAction(Vehicle vehicle){
			System.out.println("Vehicle request is in pending state");
			vehicle.setVehicleState(this);
	        if (vehicle.vHealth == 1){
	        	VVerified vf = new VVerified();
	        	vehicle.setVehicleState(new VVerified());
				vf.doAction(vehicle);
	      }
	        else if(vehicle.vHealth == 2){
				System.out.println("Vehicle add request is rejected");

	      }
	}
}


