package com.project.rms.notification;

public class PaymentNotification extends Notification
{
	public PaymentNotification(String message){
		super(message);
		
		
	}

	
	public void appendMessage() {
		
		System.out.println("Appending Payment Notification Message");
		
		this.setNotificationMsg(this.getNotificationMsg() + "\nPayment Notification for the Trip");
		
		System.out.println("Payment Notification Message Appended");
		// TODO implement me
		
	}
	
}

