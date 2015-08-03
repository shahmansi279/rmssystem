package com.project.rms.notification;

import java.util.Scanner;

public class NotificationManager
{
	
	public Notification notification;
	public NotificationContext notificationContext;
	
	public NotificationManager(){
		super();
	}

	public static void main(String[] args){
		
		System.out.println("Notification Management");
		System.out.println("1. Payment Complete");
		System.out.println("2. Trip Complete");
		System.out.println("3. Recall Available");
		
		Scanner scanner = new Scanner ( System.in );
		int select = scanner.nextInt ();
		
		if (select == 1){	

			PaymentNotification pn = new PaymentNotification();
			System.out.println("Preparing Notification...");
			pn.prepareNotification();
		}
		else if (select == 2){
			TripNotification tn = new TripNotification();
			System.out.println("Preparing Notification...");
			tn.prepareNotification();
		}
		else if (select == 3){
			RecallNotification rn = new RecallNotification();
			System.out.println("Preparing Notification...");
			rn.prepareNotification();
		}

	}
	public void getNotificationTemplate() {
		// TODO implement me	
	}
	
	public void getMemberList() {
		// TODO implement me	
	}
	
	public void appendMemberInfo() {
		// TODO implement me	
	}
	
	public void invokeNotificationContext() {
		// TODO implement me	
	}
	
}

