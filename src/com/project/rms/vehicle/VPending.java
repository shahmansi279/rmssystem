package com.project.rms.vehicle;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class VPending implements VehicleState
{
	
	public Vehicle vehicle;
	
	public VPending(Vehicle vehicle){
		super();
	}

	public void doAction(Vehicle vehicle){
			System.out.println("Vehicle request is in pending state");
			//vehicle.setVehicleState(this);
			System.out.println("Is vehicle health good or bad: ");
			System.out.println("1. good ");
			System.out.println("2. bad ");

			Scanner s = new Scanner(System.in);
			int vHealth = s.nextInt();
	        if (vHealth == 1){
	        	VVerified vf = new VVerified(vehicle);
				vf.doAction(vehicle);
	      }
	        else if(vHealth == 2){
				System.out.println("Vehicle add request is rejected");

	      }
	}
	
	/*
	@Override
	public String receiveRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String activeVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateVehicleState() {
		// TODO Auto-generated method stub
		
	}*/
	
	/*public String receiveRequest(){
		vehicle.setVehicleState(new VPending(vehicle));
		return "Request received";
	}
	public String addVehicle(){
		return "Must receive a request first";
	}
	public String activeVehicle() {
		return "Must receive a request first";
	}
	
	public void updateVehicleState() {
		// TODO implement me	
	}*/
	
}


