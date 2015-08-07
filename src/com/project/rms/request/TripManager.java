package com.project.rms.request;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
	Member m1;

	public TripManager() {
		trip = new Trip();
		this.tripArr = new ArrayList<Trip>();
		initTripData();

		pm = new PaymentManager();
	}

	private void initTripData() {

		Trip t1 = new Trip();
		t1.setTripId("T0001");
		t1.setTripSource("655 E EL Camino Real Sunnyvale CA 94087");
		t1.setTripDest("898 N First Street San Jose 95112");
		// t1.setTripFare(100.00);
		t1.setService(new YellowCab(new PrivateTaxi()));
		t1.setTripStartMiles(49980);
		this.tripArr.add(t1);

		m1 = new Customer("1", "Parth", "Cust1Lname", "Cust01@yahoo.com", "4085550001", "Cust1 Address1",
				"Cust1 Address2", "Cust1 City", "Cust1 State", "90001", "Email", "Cash", "1234567890120001", "Y",
				"PREMIER");

		Trip t2 = new Trip();
		t2.setTripId("T0002");
		t2.setTripSource("675 E San Fernando St San Jose 95112");
		t2.setTripDest("865 E EL Camino Real Santa Clara 94086");
		// t2.setTripFare(100.00);

		t2.setService(new YellowCab(new PrivateTaxi()));
		t2.setTripStartMiles(35980);

		this.tripArr.add(t2);

		Trip t3 = new Trip();
		t3.setTripId("T0003");
		t3.setTripSource("1st St San Francisco 91112");
		t3.setTripDest("E 2nd St San Jose 95112");
		t3.setTripFare(200.00);
		// t.setSvcType(new SharedTaxi());
		t3.setService(new Uber(new SharedTaxi()));
		t3.setTripStartMiles(49990);

		this.tripArr.add(t3);

		// TODO Auto-generated method stub

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

	public Trip generateTripRecord() {

		int idTrip = this.getTripArr().size();
		String newTripId = "T000" + (idTrip + 1);

		Trip t = new Trip();
		t.setTripId(newTripId);
		
		ArrayList<Member> tripCust = new ArrayList<Member>();
		tripCust.add(m1);
		t.setTripCustomers(tripCust);
		
		
		
		// for time being setting member for trip

		System.out.println("New Trip Id is " + newTripId);
		return t;

		// TODO Auto-generated method stub

	}

}
