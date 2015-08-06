package com.project.rms.vehicle;

import java.util.List;

public class VehicleManager
{
	Vehicle veh;
	public VehicleManager(){
		super();
	}

	
	public void addVehicle(String vId,String vModel,String vYear,String vIn,int vType,int vHealth) {
		// TODO implement me
		Vehicle veh = new Car();
		
		veh.setvId(vId);
		veh.setvModel(vModel);
		veh.setvYear(vYear);
		veh.setvIn(vIn);
		veh.setVehicleType(vType);
		veh.setvHealth(vHealth);
		
		
	}
	
	public Vehicle retrieveVehicle(String vehicleType) {
		// TODO implement me
		
		boolean retflag=false;
    	System.out.println("Retrieving Vehicle...");	
    	
    	for (int i = 0; i < VehicleClient.vehicles.size() && !retflag; i++) 
        {
     	        
                 if (VehicleClient.vehicles.get(i).getVehicleType() != null) //.equalsIgnoreCase(vehicleType))
                 {
                 	System.out.println("Vehicle type retrieved "+VehicleClient.vehicles.get(i).vehicleType);
                 	
                 	return VehicleClient.vehicles.get(i);
                 //	retflag=true;
                 
                 }
            
         }
    	
	}
	
	public void deleteVehicle(String vId) {
		// TODO implement me	
		
		System.out.println("Deleting Vehicle...");
        
        for (int i = 0; i < VehicleClient.vehicles.size(); i++) 
        {
     	        
                 if (VehicleClient.vehicles.get(i).getvId().equalsIgnoreCase(vId))
                 {
                 	System.out.println("Vehicle ID "+VehicleClient.vehicles.get(i).vId +" deleted");
                 	VehicleClient.vehicles.remove(i);
                 }


         }
        System.out.println("Vehicle has been deleted successfully!");
         System.out.println("Size of the list after delete operation is "
                         + VehicleClient.vehicles.size());
 }
	

	
	public void updateVehicle() {
		// TODO implement me	
	}
	
}

