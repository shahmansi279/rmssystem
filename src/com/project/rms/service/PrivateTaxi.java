package com.project.rms.service;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.project.rms.request.Trip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class PrivateTaxi implements ServiceType {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public Set<Service> service;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PrivateTaxi() {
		super();

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	@Override
	public double calculateBaseFare(int miles) {

		System.out.println("Calculating Base Fare for Private Taxi");

		double Fare = (miles) * 4;

		// TODO Auto-generated method stub
		return Fare;
	}
}
