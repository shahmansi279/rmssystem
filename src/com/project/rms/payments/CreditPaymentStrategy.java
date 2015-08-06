package com.project.rms.payments;


/**
 * <div style="text-align: left;"><br></div>
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class CreditPaymentStrategy implements PaymentStrategy
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
	public CreditPaymentStrategy(){
		super();
	}

	@Override
	public void processPayment(double fareAmount ) {
		// TODO Auto-generated method stub
		System.out.println("[______________________________________________________________]");
		System.out.println("[ ** Pattern ----> Strategy pattern ** ] used to determine payment method. ");
		System.out.println("[______________________________________________________________]");
		System.out.println("Your Credit Card Payment of  "+ fareAmount +" $ has been processed succesfully");
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
}