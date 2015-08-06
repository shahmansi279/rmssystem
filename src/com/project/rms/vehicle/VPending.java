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
			System.out.println("Is vehicle health good or bad: ");
			System.out.println("1. good ");
			System.out.println("2. bad ");

			Scanner s = new Scanner(System.in);
			int vHealth = s.nextInt();
	        if (vHealth == 1){
	        	VVerified vf = new VVerified();
	        	vehicle.setVehicleState(new VVerified());
				vf.doAction(vehicle);
	      }
	        else if(vHealth == 2){
				System.out.println("Vehicle add request is rejected");

	      }
	}
}


