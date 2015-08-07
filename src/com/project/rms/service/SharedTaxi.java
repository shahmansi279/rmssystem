package com.project.rms.service;
import java.util.Set;
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

	public void computeBaseFare(Service service) {
		// TODO implement me	
	}


	@Override
	public double calculateBaseFare(Service service) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

