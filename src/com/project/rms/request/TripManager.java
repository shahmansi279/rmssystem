package com.project.rms.request;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.project.rms.payments.Payment;
import com.project.rms.payments.PaymentManager;

public class TripManager {

	Trip trip;
	ArrayList<Trip> tripArr;
	PaymentManager pm;

	public TripManager() {
		trip = new Trip();
		tripArr = new ArrayList<Trip>();
		pm = new PaymentManager();
	}

	public ArrayList<Trip> getTripArr() {
		return tripArr;
	}

	public void setTripArr(ArrayList<Trip> tripArr) {
		this.tripArr = tripArr;
	}

	public void updateTrip(String id, String driverId) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd':'HH:mm");
		System.out.println(sdf.format(cal.getTime()));
		Date nowDate = cal.getTime();

		this.setTrip(this.fetchTrip(id));

		this.trip.setTripStatus("Completed");
		this.trip.setTripCompletedTime(nowDate);
		this.trip.setTripEndMiles(50000);

		

	}

	public Trip fetchTrip(String tripId) {

		for (Trip t : this.tripArr) {

			System.out.println("Trip " + t);
			if (t.getTripId().equals(tripId)) {
				System.out.println("Fetching trip details" + t.getTripId());
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

		updateTrip(tripId, driverId);

		invokePaymentManager();
	}

}
