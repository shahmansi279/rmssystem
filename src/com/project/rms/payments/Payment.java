package com.project.rms.payments;

import java.util.Scanner;	

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated 
 */

public class Payment
{

	public static void main( String[] args )
	{
		System.out.println("Please enter Payment Type : ' CreditCard ' or 'Cash' ");
		Scanner scanner = new Scanner ( System.in );
		String paymentType = scanner.next ();
		System.out.println("Payment Type is : " + paymentType);
		
		System.out.println("\nPlease enter amount to Pay : ");
		Scanner scanner1 = new Scanner ( System.in );
		String amount = scanner1.next ();
		System.out.println("Payment Amount : " + amount);
		
		System.out.println("\nPlease enter Name : ");
		Scanner scannerName = new Scanner ( System.in );
		String name = scannerName.next ();
		System.out.println("Customer name = : " +name);
		
		System.out.println("\nPlease enter Tripid : ");
		Scanner scannerTripid= new Scanner ( System.in );
		String tripId= scannerTripid.next ();
		System.out.println("Customer name = : " +tripId);
		
		PaymentContext ctx = null;
		ctx = new PaymentContext ();
		
		if ( "CreditCard".equalsIgnoreCase(paymentType) )
		{
				ctx.setPaymentStrategy(new CreditPaymentStrategy() );
		}
		else if ("Cash".equalsIgnoreCase(paymentType) )
		{
			ctx.setPaymentStrategy(new CashPaymentStrategy() );
		}
		
	//	System.out.println("PaymentContext has : " + ctx.getPaymentStrategy().toString());
		
		ctx.processPayment(amount);
		ctx.performProcessPayment();
	}		

	
	public PaymentStrategy paymentStrategy;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */

	public PaymentStrategy payStrategy;

	public Payment(){
		super();
	}

}

 