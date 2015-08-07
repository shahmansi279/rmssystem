package com.project.rms.service;
import java.util.Set;

import com.project.rms.request.Trip;

import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class SharedTaxi implements ServiceType
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Service> service;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public SharedTaxi(){
		super();
		
	}

	

	@Override
	public double calculateBaseFare(int miles) {
		
		System.out.println("Calculating Base Fare for Shared Taxi");
		
		double Fare=(miles)*2;
		
		
		// TODO Auto-generated method stub
		
		return Fare;
	}
	
}

