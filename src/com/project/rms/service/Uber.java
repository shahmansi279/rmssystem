package com.project.rms.service;

import java.util.ArrayList;

import com.project.rms.accounts.AccountManager;
import com.project.rms.accounts.Customer;
import com.project.rms.request.Request;
import com.project.rms.request.Trip;
import com.project.rms.request.TripManager;
import com.project.rms.vehicle.VAssigned;
import com.project.rms.vehicle.Vehicle;
import com.project.rms.vehicle.VehicleManager;
import com.project.rms.accounts.Member;

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

		// ArrayList<Request> requestArr = findSharedRideRequest(r);

		System.out.println("Dispatching Taxi for Uber Cab Service \n");

		Trip t = null;

		t = generateTrip(r);
		t = updateTrip(t, t.getTripId(), r, svcType, v);

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

	private Trip updateTrip(Trip t, String tripId, Request r, ServiceType svcType, Vehicle v) {

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

		return t;
		// TODO Auto-generated method stub

	}

	private String mergeWithSharedRequest(Request r, ArrayList<Request> requestArr) {

		return null;
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

		VehicleManager vmgr = new VehicleManager();

		Vehicle v = vmgr.retrieveVehicle(r.getrServiceTypeDesc(), r.getrPickUpAddr());

		if (v != null)

		{
			System.out.println("Acquired Resources for the Request");

			return v;
		}

		return null;
	}

	@Override
	boolean allocateResources(Request r, Vehicle v) {

		// Update vehicle and allocate it to trip

		v.setVehicleState(new VAssigned());

		System.out.println("Allocated Vehicle for the Request");

		return false;
	}

}
