package com.project.rms.vehicle;

import java.util.List;

public class VehicleManager
{
	Vehicle veh;
	public VehicleManager(){
		super();
	}

	
	public void addVehicle(Vehicle v,  List<Vehicle> vehicles) {
		// TODO implement me
		 if (!vehicles.isEmpty()){
			 veh = new Car(v.vId,v.vModel,v.vYear,v.vIn,v.description,v.vehicleType,v.getVehicleState(),v.vHealth);
	    	 vehicles.add(veh);
	    	 System.out.println("Number of vehicles after adding = "+ vehicles.size());
	    	 for (int i = 0; i < vehicles.size(); i++){
	    		 System.out.println("\n"+vehicles.get(i).getvId()+ " " +vehicles.get(i).getvModel()+" * "+ vehicles.get(i).getvYear()+ " * "+vehicles.get(i).getvIn() + " * "+vehicles.get(i).getDescription());
	        	
	    		}
		 }
		
		
	}
	
	public void retrieveVehicle(String vehicleType) {
		// TODO implement me
		
		boolean retflag=false;
    	System.out.println("Retrieving Vehicle...");	
    	
    	for (int i = 0; i < VehicleClient.vehicles.size() && !retflag; i++) 
        {
     	        
                 if (VehicleClient.vehicles.get(i).getVehicleType() != null) //.equalsIgnoreCase(vehicleType))
                 {
                 	System.out.println("Vehicle type retrieved "+VehicleClient.vehicles.get(i).vehicleType);
                 	retflag=true;
                 
                 }
                 
                 
                // System.out.println("Size of the list after retrieve operation is "+ AccountClient.members1.size());

         }
    	 if (retflag)
    	     System.out.println("Vehicle has been retrieved successfully!");
    	 else 
    		 System.out.println("Vehicle not found.. Pl try again..!");
    	
		
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

