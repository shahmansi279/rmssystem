package com.project.rms.service;

import java.util.ArrayList;

import com.project.rms.accounts.AccountManager;
import com.project.rms.request.Request;
import com.project.rms.request.Trip;
import com.project.rms.request.TripManager;
import com.project.rms.vehicle.Vehicle;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class Uber extends Service {

	public Uber(ServiceType svcType) {

		super(svcType);
		this.serviceName = "Uber";

	}

	public void setRule() {
		// TODO implement me
	}

	@Override
	double calculateBaseFare(int miles) {

		double baseFare = this.serviceType.calculateBaseFare(miles);
		// TODO Auto-generated method stub

		return calculateAdditionalCharge(baseFare);

	}

	@Override
	double calculateAdditionalCharge(double fare) {

		System.out.println("Adding extra 10 $ for Charges towards Uber Service ");

		return (fare) + 10;
		// TODO Auto-generated method stub

	}

	// Dispatch Taxi for Uber

	@Override
	public Trip dispatchTaxi(ServiceType svcType, Request r, Vehicle v) {

		ArrayList<Request> requestArr = findSharedRideRequest(r);
		String tripId = mergeWithSharedRequest(r, requestArr);
		Trip t = null;

		if (tripId != null) {
			t = fetchTrip(tripId);
			updateTrip(t, tripId, r, svcType);
		}

		else {
			t = generateTrip(r);

		}

		// TODO Auto-generated method stub

		return t;
	}

	private Trip generateTrip(Request r) {

		TripManager tm = new TripManager();
		tm.generateTripRecord();

		// TODO Auto-generated method stub

		return tm.generateTripRecord();
	}

	private Trip fetchTrip(String tripId) {

		System.out.println("Fetching Trip Details for the Request");
		// TODO Auto-generated method stub
		return new Trip();
	}

	private boolean updateTrip(Trip t, String tripId, Request r, ServiceType svcType) {

		System.out.println("Updating Trip with ID " + tripId + " with request with ID " + r.getrId());

		// accountMgr
		AccountManager am = new AccountManager();
		
		
	//	t.tripCustomers.add(am.retrieveCustomer(r.getMemberId()));
		t.setTripSource(r.getrPickUpAddr());
		t.setTripDest(r.getrDestAddr());
		t.setSvcType(svcType);
		t.setTripPickUpTime(r.getrPickupDateTime());
		t.setTripCustomer(t.tripCustomer);

		return true;
		// TODO Auto-generated method stub

	}

	private String mergeWithSharedRequest(Request r, ArrayList<Request> requestArr) {

		return "T0001";
		// TODO Auto-generated method stub

	}

	private ArrayList<Request> findSharedRideRequest(Request r) {

		System.out.println("Fetching Shared Ride Passengers for the Request");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Vehicle fetchResource(Request r) {

		System.out.println("Checking Resource Pool for the Request");

		// Retrieving Contractor Owned or Company Owned Vehicle based on Request

		// String v=null;

		// Vehicle v=vmgr.retrieveVehicle(r.getServiceType());

		// if(v!=null)

		System.out.println("Acquired Resources for the Request");

		// return v;
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	boolean allocateResources(Request r, Vehicle v) {

		// Update vehicle and allocate it to trip

		// v.updateVehicleState(new )

		System.out.println("Allocated Vehicle for the Request");
		// TODO Auto-generated method stub
		return false;
	}

}
