package com.project.rms.service;

import com.project.rms.request.Request;
import com.project.rms.request.Trip;
import com.project.rms.vehicle.Vehicle;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class YellowCab extends Service {

	public YellowCab() {
		super();
	}

	public void setRule() {
		// TODO implement me
	}

	@Override
	void calculateBaseFare() {
		// TODO Auto-generated method stub

	}

	@Override
	void calculateAdditionalCharge() {
		// TODO Auto-generated method stub

	}

	@Override
	public Trip dispatchTaxi(ServiceType svcType, Request r, Vehicle v) {

		Trip t = generateTrip(r);
		// TODO Auto-generated method stub
		return t;
	}

	private Trip generateTrip(Request r) {
		// TODO Auto-generated method stub
		return new Trip();
	}

	private Trip fetchTrip(String tripId) {

		System.out.println("Fetching Trip Details for the Request");
		// TODO Auto-generated method stub
		return new Trip();
	}

	private boolean updateTrip(Trip t, String tripId, Request r, ServiceType svcType) {

		System.out.println("Updating Trip with ID -T1101 with request with ID 00004");

		t.tripCustomer.add(r.getMemberId());
		t.setTripSource(r.getrPickUpAddr());
		t.setTripDest(r.getrDestAddr());
		t.setSvcType(svcType);
		t.setTripPickUpTime(r.getrPickupDateTime());
		t.setTripCustomer(t.tripCustomer);

		return true;
		// TODO Auto-generated method stub

	}

	@Override
	Vehicle fetchResource(Request r) {

		System.out.println("Checking Resource Pool for the Request");

		// Retrieving Contractor Owned or Company Owned Vehicle based on Request

		// String v=null;
		Vehicle v = null;
		// Vehicle v=vmgr.retrieveVehicle(r.getServiceType());

		// if(v!=null)

		System.out.println("Acquired Resources for the Request");

		return v;

		// TODO Auto-generated method stub

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
