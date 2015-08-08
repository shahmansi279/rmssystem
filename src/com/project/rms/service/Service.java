package com.project.rms.service;

import java.util.Set;

import com.project.rms.accounts.AccountManager;
import com.project.rms.request.Request;
import com.project.rms.request.Trip;
import com.project.rms.request.TripManager;
import com.project.rms.vehicle.Vehicle;

import java.util.ArrayList;
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

	public abstract void setRule();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	
	//Template Pattern to Compute Trip fare
	
	public final double computeFare(Trip trip) {

		double fare;
		int miles;
		System.out.println("Calculating Trip Fare");

		miles = computeDistance(trip);

		System.out.println("Trip Miles are " + miles);

		trip.setTripMiles(miles);

		System.out.println("Calculating Service Base Fare");

		fare = calculateBaseFare(miles);

		return fare;
		// TODO implement me
	}

	public int computeDistance(Trip trip) {
		// TODO implement me

		System.out.println("Calculating Trip Miles");

		return trip.getTripEndMiles() - trip.getTripStartMiles();

	}

	abstract double calculateBaseFare(int miles);
	// TODO implement me

	abstract double calculateAdditionalCharge(double fare);

	

	abstract Trip dispatchTaxi(ServiceType svcType, Request r, Vehicle v);

	public Trip dispatchService(Request r) {

		Vehicle v = fetchResource(r);
		if (v != null) {
			allocateResources(r, v);
			return dispatchTaxi(this.getServiceType(), r, v);
		}

		else {

			System.out.println("No vehicles found for the request");
			return null;
		}

	}

	abstract Vehicle fetchResource(Request r);

	abstract boolean allocateResources(Request r, Vehicle v);
	
	protected Trip generateTrip(Request r) {

		TripManager tm = new TripManager();
		tm.generateTripRecord();

		// TODO Auto-generated method stub

		return tm.generateTripRecord();
	}

	protected Trip fetchTrip(String tripId) {

		System.out.println("Fetching Trip Details for the Request");
		// TODO Auto-generated method stub
		return new Trip();
	}

	protected Trip updateTrip(Trip t, String tripId, Request r, ServiceType svcType, Vehicle v) {

		System.out.println("Updating Trip with ID " + tripId + " with request with ID " + r.getrId());

		// accountMgr

		AccountManager am = new AccountManager();
		ArrayList<String> memList = new ArrayList<String>();

		memList.add(r.getMemberId());
		t.setTripCustomer(memList);
		t.setTripSource(r.getrPickUpAddr());
		t.setTripDest(r.getrDestAddr());
		t.setSvcType(svcType);
		t.setTripPickUpTime(r.getrPickupDateTime());
		t.setTripCustomer(t.tripCustomer);
		t.setVehicle(v);
		t.setrFeature(r.getrFeature());
		
		
		
		
		return t;
		// TODO Auto-generated method stub

	}
	
	
	
}
