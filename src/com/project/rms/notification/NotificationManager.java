package com.project.rms.notification;

import java.util.Scanner;

import com.project.rms.accounts.SystemOwner;

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
		System.out.println("3. Recall Notification");
		
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
			
			//create subject
	        RecallNotification topic = new RecallNotification();
	         
	        //create observers
	        Observer obj1 = new SubjectSubscriber("Observer1");
	        Observer obj2 = new SubjectSubscriber("Observer2");
	        Observer obj3 = new SubjectSubscriber("Observer3");
	         
	        //register observers to the subject
	        topic.register(obj1);
	        topic.register(obj2);
	        topic.register(obj3);
	         
	        //attach observer to subject
	        obj1.setSubject(topic);
	        obj2.setSubject(topic);
	        obj3.setSubject(topic);
	         
	        //check if any update is available
	        obj1.update();
	         
	        //now send message to subject
	        topic.appendMessage();
	        topic.postMessage(" :: New Message");
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

