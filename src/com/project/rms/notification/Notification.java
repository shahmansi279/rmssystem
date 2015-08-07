package com.project.rms.notification;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

 public abstract class Notification{
	
	public String message;
	
	public String headerMessage;
	
	public NotificationManager notificationManager;
	
	public Notification(){
		super();
	}

	
public final void prepareNotification() {
		// TODO implement me	
	prepareHeader();
	appendMessage();
	}
	
	public void prepareHeader() {
		// TODO implement me
		System.out.println("RMS System Notification");
	}
	
	public abstract void appendMessage() ;
	
}

