package com.project.rms.payments;

import java.util.Scanner;

import com.project.rms.request.Trip;

public class PaymentManager {

	PaymentContext ctx = null;

	Trip trip;

	public void processPayment() {
		// TODO Auto-generated method stub

		this.trip = new Trip();

	}

	public void processTripPayment(Trip trip) {

		this.trip = trip;

		double fare = computeTripFare(trip);
		this.trip.setTripFare(fare);
		
		System.out.println("The total fare for the ride is " + fare);

		String paymentMethod = fetchPaymentStrategy(this.trip);

		invokePaymentContext(paymentMethod, trip.getTripFare());

	}

	private double computeTripFare(Trip trip) {

		return this.trip.getService().computeFare(trip);

		// TODO Auto-generated method stub

	}

	private String fetchPaymentStrategy(Trip trip) {

		// Fetch input from user

		// if user premium customer set payment method to credit card

		// if(trip)

		// set payment method to credit card

		// else cash or credit card

		System.out.println("Please enter Payment Type : ' CreditCard ' or 'Cash' ");
		Scanner scanner = new Scanner(System.in);
		String paymentStrategy = scanner.next();
		System.out.println("Payment Type is : " + paymentStrategy);

		// TODO Auto-generated method stub
		return paymentStrategy;
	}

	private void invokePaymentContext(String paymentMethod, double amount) {

		// Invoking payment context to process payment based on strategy
		// determined

		this.trip = trip;

		PaymentContext ctx = null;
		ctx = new PaymentContext();

		if ("CreditCard".equalsIgnoreCase(paymentMethod)) {
			ctx.setPaymentStrategy(new CreditPaymentStrategy());
		} else if ("Cash".equalsIgnoreCase(paymentMethod)) {

			System.out.println(paymentMethod + "----");
			ctx.setPaymentStrategy(new CashPaymentStrategy());
		}

		ctx.performProcessPayment(amount);

	}
}
