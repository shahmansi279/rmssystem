package com.project.rms.service;

import java.util.Set;

import com.project.rms.request.Request;
import com.project.rms.request.Trip;
import com.project.rms.vehicle.Vehicle;

import java.util.HashSet;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public abstract class Service {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public ServiceType sType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public String sDescription;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public String vendorDesc;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public ServiceRule sRule;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public ServiceType serviceType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public Set<ServiceRule> serviceRule;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Service() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public abstract void setRule();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	final void computeFare(Trip trip) {

		System.out.println("Calculating Trip Fare");

		computeDistance(trip);

		calculateBaseFare();

		// TODO implement me
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	abstract void calculateBaseFare();
	// TODO implement me

	abstract void calculateAdditionalCharge();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public void computeDistance(Trip trip) {
		// TODO implement me

		System.out.println("Calculating Trip Miles");

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param v
	 * @generated
	 * @ordered
	 */

	abstract Trip dispatchTaxi(ServiceType svcType, Request r, Vehicle v);

	public Trip dispatchService(Request r) {

		Vehicle v = fetchResource(r);
		allocateResources(r,v);
		return dispatchTaxi(this.getServiceType(), r, v);

	}

	abstract Vehicle fetchResource(Request r);

	abstract boolean allocateResources(Request r, Vehicle v);
}
