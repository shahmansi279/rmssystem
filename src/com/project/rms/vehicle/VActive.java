package com.project.rms.vehicle;

public class VActive implements VehicleState
{
	
	public Vehicle vehicle;
	Vehicle veh;

	public VActive(){

		super();
	}
	
	public void doAction(Vehicle vehicle){
		System.out.println("Vehicle is in active state");
		vehicle.setVehicleState(this);
		if (veh.getvDriver() != null){
			VAssigned va = new VAssigned();
        	vehicle.setVehicleState(new VAssigned());
			va.doAction(vehicle);
		}
		
      }
}
	

