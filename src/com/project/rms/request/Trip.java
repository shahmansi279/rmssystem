package com.project.rms.request;

import java.util.ArrayList;
import java.util.Date;

import com.project.rms.accounts.Member;
import com.project.rms.service.Service;
import com.project.rms.service.ServiceType;
import com.project.rms.utils.GPSLocation;
import com.project.rms.vehicle.Vehicle;

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
	public ArrayList<String> tripCustomer;
	public Member vehicleDriver;
	public String tripStatus;
	public int tripMiles;
	public String tripSource;
	public String tripDest;
	public Date tripPickUpTime;
	public Date tripCompletedTime;
	public ServiceType svcType;
	public Service service;
	public int tripStartMiles;
	public int tripEndMiles;
	public Vehicle vehicle;
	double tripFare;

	
	public double getTripFare() {
		return tripFare;
	}

	public void setTripFare(double tripFare) {
		this.tripFare = tripFare;
	}

	public Trip() {
		super();

		tripCustomer = new ArrayList<String>();
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

	public int getTripMiles() {
		return tripMiles;
	}

	public void setTripMiles(int miles) {
		this.tripMiles = miles;
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

	public ArrayList<String> getTripCustomer() {
		return tripCustomer;
	}

	public void setTripCustomer(ArrayList<String> tripCustomer) {
		this.tripCustomer = tripCustomer;
	}

	public void update() {
		// TODO implement me
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public ServiceType getSvcType() {
		return svcType;
	}

	public void setSvcType(ServiceType svcType) {
		this.svcType = svcType;
	}

	public int getTripStartMiles() {
		return tripStartMiles;
	}

	public void setTripStartMiles(int tripStartMiles) {
		this.tripStartMiles = tripStartMiles;
	}

	public int getTripEndMiles() {
		return tripEndMiles;
	}

	public void setTripEndMiles(int tripEndMiles) {
		this.tripEndMiles = tripEndMiles;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
