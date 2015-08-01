package com.project.rms.vehicle;
import java.util.Set;
import java.util.HashSet;


public class VVerified implements VehicleState
{
	
	public Set<Vehicle> vehicle;
	
	public VVerified(){
		super();
	}
	
	public String receiveRequest(){
		vehicle.setVehicleState(new VPending(vehicle));
		return "Already received request";
	}
	public String addVehicle(){
		if ((request == "add") && (vHealth == "good")){
			return "The vehicle is verified";
			vehicle.setVehicleState(new VVerified(vehicle));
		}
		else if ((request == "add") && (vHealth == "bad")){
			return "The vehicle is rejected";
			vehicle.setVehicleState(new VRejected(vehicle));
		}
		else if (request == "remove"){
			return "The vehicle is removed";
			vehicle.setVehicleState(new VRemoved(vehicle));
		}
			
	}
	public String activeVehicle() {
		return "Must be evaluated first";
	}
	
	public void updateVehicleState() {
		// TODO implement me	
	}
	
}