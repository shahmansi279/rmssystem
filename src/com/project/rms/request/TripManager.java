package com.project.rms.request;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.project.rms.accounts.Customer;
import com.project.rms.accounts.Member;
import com.project.rms.payments.Payment;
import com.project.rms.payments.PaymentManager;
import com.project.rms.service.PrivateTaxi;
import com.project.rms.service.SharedTaxi;
import com.project.rms.service.Uber;
import com.project.rms.service.YellowCab;

public class TripManager {

	Trip trip;
	ArrayList<Trip> tripArr;
	PaymentManager pm;

	public TripManager() {

		trip = new Trip();
		this.tripArr = new ArrayList<Trip>();
		initTripData();

		pm = new PaymentManager();
	}

	private void initTripData() {

		this.tripArr = new ArrayList<Trip>();

		Trip t1 = new Trip();
		t1.setTripId("T0001");
		t1.setTripSource("655 E EL Camino Real Sunnyvale CA 94087");
		t1.setTripDest("898 N First Street San Jose 95112");
		// t1.setTripFare(100.00);
		t1.setService(new YellowCab(new PrivateTaxi()));
		t1.setTripStartMiles(49980);
		HashMap<String, String> feature1 = new HashMap<String, String>();
		feature1.put("Wheel Chair", "y");
		feature1.put("Infant Seat", "y");
		t1.setrFeature(feature1);
		this.tripArr.add(t1);

		Trip t2 = new Trip();
		t2.setTripId("T0002");
		t2.setTripSource("675 E San Fernando St San Jose 95112");
		t2.setTripDest("865 E EL Camino Real Santa Clara 94086");
		t2.setService(new YellowCab(new PrivateTaxi()));
		t2.setTripStartMiles(35980);

		HashMap<String, String> feature2 = new HashMap<String, String>();
		feature2.put("Wheel Chair", "y");
		feature2.put("Infant Seat", "n");
		t2.setrFeature(feature2);
		this.tripArr.add(t2);

		Trip t3 = new Trip();
		t3.setTripId("T0003");
		t3.setTripSource("1st St San Francisco 91112");
		t3.setTripDest("E 2nd St San Jose 95112");
		t3.setTripFare(200.00);
		t3.setService(new Uber(new SharedTaxi()));
		t3.setTripStartMiles(49990);
		HashMap<String, String> feature3 = new HashMap<String, String>();
		feature3.put("Wheel Chair", "y");
		feature3.put("Infant Seat", "y");
		t3.setrFeature(feature3);

		this.tripArr.add(t3);

		// TODO Auto-generated method stub

	}

	public ArrayList<Trip> getTripArr() {
		return tripArr;
	}

	public void setTripArr(ArrayList<Trip> tripArr) {
		this.tripArr = tripArr;
	}

	public void updateTrip(String tripId, String driverId, String tripEndMiles) {

		System.out.println("Updating Trip to Completed Status \n");
		initTripData();

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd':'HH:mm");

		Date nowDate = cal.getTime();

		this.trip = fetchTrip(tripId);

		this.trip.setTripStatus("Completed");
		this.trip.setTripCompletedTime(nowDate);
		int tripMile = Integer.parseInt(tripEndMiles);
		this.trip.setTripEndMiles(tripMile);

	}

	public Trip fetchTrip(String tripId) {

		for (Trip t : this.tripArr) {

			if (t.getTripId().equals(tripId)) {

				System.out.println("Fetching trip details for TRIP ID " + t.getTripId());
				return t;
			}
		}

		// TODO Auto-generated method stub
		return null;
	}

	public Payment computeTripFare(Trip t) {

		return null;

	}

	public void processTripPayment(Payment p, Trip t) {

	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public String fetchTripInput() {

		// TODO Auto-generated method stub
		return null;
	}

	public void invokePaymentManager() {

		// Call to payment

		this.pm.processTripPayment(trip);

		// TODO Auto-generated method stub

	}

	public void processTripUpdateRequest() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nPlease enter your member account id ");
		String driverId = sc.nextLine();

		System.out.println("\nPlease enter your trip id ");
		String tripId = sc.nextLine();

		System.out.println("\nPlease enter trip end miles ");
		String tripMiles = sc.nextLine();

		updateTrip(tripId, driverId, tripMiles);

		invokePaymentManager();
	}

	public Trip generateTripRecord() {

		int idTrip = this.getTripArr().size();
		String newTripId = "T000" + (idTrip + 1);

		Trip t = new Trip();
		t.setTripId(newTripId);

		return t;

	}

}
