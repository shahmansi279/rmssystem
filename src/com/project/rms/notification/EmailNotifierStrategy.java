package com.project.rms.notification;

public class EmailNotifierStrategy implements NotifierStrategy {

	public NotificationContext notificationContext;

	public EmailNotifierStrategy() {
		super();
	}

	@Override
	public void sendNotification(Notification n) {

		System.out.println("Sending Email Notification to Member Email  with message " +n.getNotificationMsg());
				

		System.out.println("Email Notification was sent successfully to Mobile Number");

	}

}
