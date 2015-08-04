package com.project.rms.vehicle;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class VVerified implements VehicleState
{
	
	public Vehicle vehicle;
	
	public VVerified(Vehicle vehicle){
		super();
	}
	
	public void doAction(Vehicle vehicle){
		System.out.println("Vehicle request is in verified state");
		//vehicle.setVehicleState(this);
		System.out.println("Is vehicle");
		System.out.println("1. company owned");
		System.out.println("2. contractor owned");
		Scanner s = new Scanner ( System.in );
		int vType = s.nextInt ();
        if (vType == 1){
        	VActive va = new VActive(vehicle);
			va.doAction(vehicle);
      }else if(vType == 2){
    	  
      }
}

	

	/*public String receiveRequest(){
		vehicle.setVehicleState(new VPending(vehicle));
		return "Already received request";
	}
	public String addVehicle(){
		if ((vRequest == "add") && (vHealth == "good")){
			return "The vehicle is verified";
			vehicle.setVehicleState(new VVerified(vehicle));
		}
		else if ((vRequest == "add") && (vHealth == "bad")){
			return "The vehicle is rejected";
			vehicle.setVehicleState(new VRejected(vehicle));
		}
		else if (vRequest == "remove"){
			return "The vehicle is removed";
			vehicle.setVehicleState(new VRemoved(vehicle));
		}
			
	}
	public String activeVehicle() {
		return "Must be evaluated first";
	}
	
	public void updateVehicleState() {
		// TODO implement me	
	}*/
	
}