package com.project.rms.payments;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class PaymentContext
{
	
	//public PaymentStrategy payStrategy;
	
 public PaymentStrategy paymentStrategy;
	
	public void setPaymentStrategy(PaymentStrategy strategy)
	{
		this.paymentStrategy = strategy;
	}

	public PaymentStrategy getPaymentStrategy()
	{
		return paymentStrategy  ;
	}
	
	public PaymentContext(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void performProcessPayment(double tripFare) {
		// TODO implement me	
		
		System.out.println("We are processing your payment... Thank you for your business");
		
		paymentStrategy.processPayment(tripFare);
	}
	
	

	
}

