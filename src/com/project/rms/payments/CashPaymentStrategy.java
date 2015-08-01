package com.project.rms.payments;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class CashPaymentStrategy implements PaymentStrategy
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public PaymentContext paymentContext;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Payment payment;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public CashPaymentStrategy(){
		super();
	}

	@Override
	public void processPayment(String amount) {
		// TODO Auto-generated method stub
		System.out.println("[______________________________________________________________]");
		System.out.println("[ ** Pattern ----> Strategy pattern ** ] used to determine payment method. ");
		System.out.println("[______________________________________________________________]");
		System.out.println("Payment method is  Cash ");
		System.out.println("Payment amount = "+amount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	

	
}

