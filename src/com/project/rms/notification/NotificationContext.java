package com.project.rms.notification;

public class NotificationContext {

	private NotifierStrategy notifierStrategy;

	private Notification notification;

	public NotificationContext() {
		super();
	}

	public NotifierStrategy getNotifierStrategy() {
		return notifierStrategy;
	}

	public void setNotifierStrategy(NotifierStrategy notifierStrategy) {
		this.notifierStrategy = notifierStrategy;
	}

	public Notification getNotification() {
		return notification;
	}

	public void sendNotification(Notification n, String memberIdentification) {
		this.notifierStrategy.sendNotification(n, memberIdentification);
	}

}
