package com.project.rms.request;
import java.util.Set;

import com.project.utils.GPSHelper;

import java.sql.Timestamp;
import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ReqMgmtFacade
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Request> request;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ReqMgmtFacade(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void createRequest(String rPickLocAddr, String rDestLoc, Timestamp rPickUpTime, String rServiceType, String rVehicle, String rFeature)

	{
		
		
		GPSHelper g= new GPSHelper();
		Request r = new Request();
		
		r.setrPickLoc(g.getGPSLocation(rPickLocAddr));
		r.setrDestLoc(g.getGPSLocation(rDestLoc));		
		r.setrPickupDateTime(rPickUpTime);
		r.setrServiceType(rServiceType);
		r.setrFeature(rFeature);
		r.setrStatus("Created");

		System.out.println("Request Created with ID : " );
	

		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void updateRequestState() {
		
		
		
		// TODO implement me	
	}
	
	public void updateRequest() {
		
		
		
		// TODO implement me	
	}
	
	
	
	public void processRequest() {
		// TODO implement me	
	}
	
	
	
	public void sendNotifications() {
		// TODO implement me	
	}
	
}

