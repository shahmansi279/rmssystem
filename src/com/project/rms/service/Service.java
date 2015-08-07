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
	protected String serviceName;
	protected ServiceType sType;

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

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Service(ServiceType serviceType) {
		super();
		this.serviceType = serviceType;
	
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

	public final double computeFare(Trip trip) {

		double fare;
		int miles;
		System.out.println("Calculating Trip Fare");

		miles = computeDistance(trip);

		System.out.println("Trip Miles are " + miles);

		trip.setTripMiles(miles);

		System.out.println("Calculating Service Base Fare");

		fare=calculateBaseFare(miles);

	

		
		return fare;
		// TODO implement me
	}

	protected ServiceType getServiceType() {
		return serviceType;
	}

	protected void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	abstract double calculateBaseFare(int miles);
	// TODO implement me

	abstract double calculateAdditionalCharge(double fare);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public int computeDistance(Trip trip) {
		// TODO implement me

		System.out.println("Calculating Trip Miles");

		return trip.getTripEndMiles() - trip.getTripStartMiles();

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
		allocateResources(r, v);
		return dispatchTaxi(this.getServiceType(), r, v);

	}

	abstract Vehicle fetchResource(Request r);

	abstract boolean allocateResources(Request r, Vehicle v);
}
