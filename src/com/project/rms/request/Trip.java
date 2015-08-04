package com.project.rms.request;

import java.util.ArrayList;
import java.util.Date;

import com.project.rms.accounts.Member;
import com.project.rms.service.ServiceType;
import com.project.rms.utils.GPSLocation;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class Trip {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public String tripId;
	public ArrayList<Member> tripCustomers;

	
	public Member tripCustomer;
	public Member vehicleDriver;
	public String tripStatus;
	public String tripMiles;
	public String tripSource;
	public String tripDest;
	public Date tripPickUpTime;
	public Date tripCompletedTime;
	public ServiceType svcType;

	

	public Trip() {
		super();
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public Member getVehicleDriver() {
		return vehicleDriver;
	}

	public void setVehicleDriver(Member vehicleDriver) {
		this.vehicleDriver = vehicleDriver;
	}

	public String getTripStatus() {
		return tripStatus;
	}

	public void setTripStatus(String tripStatus) {
		this.tripStatus = tripStatus;
	}

	public String getTripMiles() {
		return tripMiles;
	}

	public void setTripMiles(String tripMiles) {
		this.tripMiles = tripMiles;
	}

	public String getTripSource() {
		return tripSource;
	}

	public void setTripSource(String tripSource) {
		this.tripSource = tripSource;
	}

	public String getTripDest() {
		return tripDest;
	}

	public void setTripDest(String tripDest) {
		this.tripDest = tripDest;
	}

	public Date getTripPickUpTime() {
		return tripPickUpTime;
	}

	public void setTripPickUpTime(Date tripPickUpTime) {
		this.tripPickUpTime = tripPickUpTime;
	}

	public Date getTripCompletedTime() {
		return tripCompletedTime;
	}

	public void setTripCompletedTime(Date tripCompletedTime) {
		this.tripCompletedTime = tripCompletedTime;
	}

	public ArrayList<Member> getTripCustomers() {
		return tripCustomers;
	}

	public void setTripCustomers(ArrayList<Member> tripCustomers) {
		this.tripCustomers = tripCustomers;
	}

	public Member getTripCustomer() {
		return tripCustomer;
	}

	public void setTripCustomer(Member tripCustomer) {
		this.tripCustomer = tripCustomer;
	}

	public void update() {
		// TODO implement me
	}
	public ServiceType getSvcType() {
		return svcType;
	}

	public void setSvcType(ServiceType svcType) {
		this.svcType = svcType;
	}
	
	

}
