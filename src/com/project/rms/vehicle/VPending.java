package com.project.rms.vehicle;
import java.util.Set;
import java.util.HashSet;


public class VPending implements VehicleState
{
	
	public Vehicle vehicle;
	
	public VPending(Vehicle vehicle){
		super();
	}
	
	public String receiveRequest(){
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
	}
	
}


