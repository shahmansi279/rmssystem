package com.project.rms.service;

import java.util.ArrayList;

import com.project.rms.accounts.AccountManager;
import com.project.rms.accounts.Customer;
import com.project.rms.accounts.Member;
import com.project.rms.request.Request;
import com.project.rms.request.Trip;
import com.project.rms.request.TripManager;
import com.project.rms.vehicle.Vehicle;
import com.project.rms.vehicle.VehicleManager;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class YellowCab extends Service {

	public YellowCab(ServiceType svcType) {
		super(svcType);
		this.serviceName = "YellowCab";

	}

	public void setRule() {
		// TODO implement me
	}

	@Override
	public Trip dispatchTaxi(ServiceType svcType, Request r, Vehicle v) {

		System.out.println("Dispatching Taxi for Yellow Cab Service \n");

		Trip t = null;

		t = generateTrip(r);
		t = updateTrip(t, t.getTripId(), r, svcType, v);

		// TODO Auto-generated method stub
		return t;
	}

	

	@Override
	Vehicle fetchResource(Request r) {

		System.out.println("Checking Resource Pool for the Request");

		// Retrieving Contractor Owned or Company Owned Vehicle based on Request

		// String v=null;
		VehicleManager vmgr = new VehicleManager();

		Vehicle v = vmgr.retrieveVehicle(r.getrServiceTypeDesc(), r.getrPickUpAddr());

		if (v != null)

		{
			System.out.println("Acquired Resources for the Request");

			return v;
		}

		return null;
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

	@Override

	double calculateBaseFare(int miles) {

		double baseFare = this.serviceType.calculateBaseFare(miles);
		// TODO Auto-generated method stub

		return calculateAdditionalCharge(baseFare);

	}

	@Override
	double calculateAdditionalCharge(double fare) {

		System.out.println("Adding extra 15 $ for Charges towards Yellow Cab Service ");

		return (fare) + 10;
		// TODO Auto-generated method stub

	}

}
