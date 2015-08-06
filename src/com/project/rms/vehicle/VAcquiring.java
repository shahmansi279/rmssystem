package com.project.rms.vehicle;

public class VAcquiring implements VehicleState{
	
public Vehicle vehicle;
	
	public VAcquiring(){
		super();
	}
	
	public void doAction(Vehicle vehicle){
		System.out.println("Vehicle is in acquiring state");
		vehicle.setVehicleState(this);
		
    
        	VActive va = new VActive();
        	vehicle.setVehicleState(new VActive());
			va.doAction(vehicle);
      
        
	}

}
