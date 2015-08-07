package com.project.rms.notification;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class TripNotification extends Notification {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TripNotification(String message) {
		super(message);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public void appendMessage() {
		// TODO implement me
		System.out.println("Appending Trip Notification Message");
		
		this.setNotificationMsg(this.getNotificationMsg()+  "\nTrip Notification for the Trip requested");
		
		System.out.println("Trip Notification Message Set");
		// TODO implement me}
	}

}
