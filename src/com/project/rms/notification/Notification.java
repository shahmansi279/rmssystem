package com.project.rms.notification;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public abstract class Notification {

	public String message;
	public String headerMessage;
	public NotificationManager notificationManager;
	public String notificationMsg;
	public String notificationMemberId;
	public String notificationId;
	public String notificationEmail;
	
	public Notification(String message) {
		super();

		this.message = message;
	}
	
	public String getNotificationEmail() {
		return notificationEmail;
	}

	public void setNotificationEmail(String notificationEmail) {
		this.notificationEmail = notificationEmail;
	}

	

	public final Notification prepareNotification() {
		// TODO implement me
		prepareHeader();
		appendMessage();
		
		return this;
	}

	public void prepareHeader() {
		// TODO implement me
		this.setMessage(headerMessage);
		headerMessage=" \nRMS System Notification for Member " ;
		this.setNotificationMsg(headerMessage);
		
	}

	public abstract void appendMessage();

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHeaderMessage() {
		return headerMessage;
	}

	public void setHeaderMessage(String headerMessage) {
		this.headerMessage = headerMessage;
	}

	public NotificationManager getNotificationManager() {
		return notificationManager;
	}

	public void setNotificationManager(NotificationManager notificationManager) {
		this.notificationManager = notificationManager;
	}

	public String getNotificationMsg() {
		return notificationMsg;
	}

	public void setNotificationMsg(String notificationMsg) {
		this.notificationMsg = notificationMsg;
	}

	public String getNotificationMemberId() {
		return notificationMemberId;
	}

	public void setNotificationMemberId(String notificationMemberId) {
		this.notificationMemberId = notificationMemberId;
	}

	public String getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}

	
	
}
