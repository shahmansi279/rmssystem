package com.project.rms.vehicle;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class VehicleManager
{
	Vehicle v;
	public VehicleManager(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addVehicle(String vId) {
		// TODO implement me
		
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void retrieveVehicle(String vId) {
		// TODO implement me
		
		boolean retflag=false;
    	System.out.println("Printing after retrieving ..");	
    	
    	for (int i = 0; i < VehicleClient.vehicles.size() && !retflag; i++) 
        {
     	        
                 /*if (VehicleClient.vehicles.get(i).getvId().equalsIgnoreCase(vId))
                 {
                 	System.out.println("Member First name retrieved "+VehicleClient.vehicles.get(i).vId);
                 	retflag=true;
                 
                 }*/
                 
                 
                // System.out.println("Size of the list after retrieve operation is "+ AccountClient.members1.size());

         }
    	 if (retflag)
    	     System.out.println("Vehicle has been retrieved successfully!");
    	 else 
    		 System.out.println("Vehicle not found.. Pl try again..!");
    	
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @param vId 
	 * @generated
	 * @ordered
	 */
	
	public void deleteVehicle(String vId) {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void updateVehicle() {
		// TODO implement me	
	}
	
}

