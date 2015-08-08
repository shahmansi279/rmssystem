package com.project.rms.notification;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class SMSNotifierStrategy implements NotifierStrategy {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public NotificationContext notificationContext;

	public SMSNotifierStrategy() {
		super();
	}

	@Override
	public void sendNotification(Notification n) {

		System.out.println("Sending SMS Notification to Member Mobile Number  with message  " + n.getNotificationMsg());
		
		System.out.println(" SMS Notification was sent successfully to Mobile Number");
		// TODO Auto-generated method stub

	}

}
