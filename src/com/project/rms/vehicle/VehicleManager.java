package com.project.rms.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager
{
	Vehicle veh;
	public VehicleManager(){
		super();
	}

	
	public Vehicle addVehicle(String vId,String vModel,String vYear,String vIn,int vType,int vHealth,String vDriver) {
		
		// TODO implement me
		
		Vehicle veh = new Car();
		
		veh.setvId(vId);
		veh.setvModel(vModel);
		veh.setvYear(vYear);
		veh.setvIn(vIn);
		veh.setVehicleType(vType);
		veh.setvHealth(vHealth);
		veh.setvDriver(vDriver);
		System.out.println("Vehicle Details - " + veh.getvId()+" " + veh.getvDriver());

		return veh;
		
	}
	
	public Vehicle retrieveVehicle(String vehicleType) {
		// TODO implement me
		if ((veh.getVehicleType() == 1)&&(vehicleType == "PrivateTaxi")){
			return veh;
		}
		else if ((veh.getVehicleType() == 2)&&(vehicleType == "SharedTaxi")){
			return veh;
		}
	return null;
	} 
	
	public void deleteVehicle(String vId) {
		// TODO implement me	
	        
        for (int i = 0; i < VehicleClient.vehicles.size(); i++) 
        {
     	        
                 if (VehicleClient.vehicles.get(i).getvId().equalsIgnoreCase(vId))
                 {
                 	System.out.println("Vehicle ID "+VehicleClient.vehicles.get(i).vId +" deleted");
                 	VehicleClient.vehicles.remove(i);
                 }


         }
        
 }
	

	
	public void updateVehicle() {
		// TODO implement me	
	}
	
}

