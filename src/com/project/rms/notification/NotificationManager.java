package com.project.rms.notification;

import java.util.Scanner;

import com.project.rms.accounts.AccountManager;
import com.project.rms.accounts.Member;
import com.project.rms.accounts.SystemOwner;

public class NotificationManager {

	public Notification notification;
	public NotificationContext notificationContext;

	public NotificationManager() {
		super();
	}

	public void manageNotification(){
		// create subject 
		  OfferNotification topic = new OfferNotification("Subject");

		
		System.out.println("Notification Management");
		System.out.println("1. Post Offer Notification");
		System.out.println("2. Register a Subscriber");
		System.out.println("3. Unregister a Subscriber");

		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();

		  if (select == 1) {
			  System.out.println("Enter offer message to be posted");
			  Scanner scanner1 = new Scanner(System.in);
			  String msg = scanner1.nextLine();
			  
			  
			// create observers 
			  Observer obj1 = new SubjectSubscriber("Observer1"); 
			  Observer obj2 = new SubjectSubscriber("Observer2"); 
			  Observer obj3 = new SubjectSubscriber("Observer3");
			  
			// register observers to the subject  
			  topic.register(obj1); 
			  topic.register(obj2); 
			  topic.register(obj3);
			  
			// attach observer to subject  
			  obj1.setSubject(topic); 
			  obj2.setSubject(topic); 
			  obj3.setSubject(topic);
			  
			  //obj1.update();
			  
			  topic.appendMessage();
			  topic.postMessage(" New Message :: "+msg);
			  
			  System.out.println("Offer sent");

		  }
		  else if(select == 2){
			  
			  
			  System.out.println("Enter subscriber name");
			  Scanner scanner2 = new Scanner(System.in);
			  String subs = scanner2.nextLine();
			  Observer ob = new SubjectSubscriber(subs);
			  topic.register(ob);
			  System.out.println("Subscriber Registered");
		  }
		  else if(select == 3){
			  
			  
			  System.out.println("Enter subscriber name");
			  Scanner scanner2 = new Scanner(System.in);
			  String subs = scanner2.nextLine();
			  Observer ob = new SubjectSubscriber(subs);
			  topic.unregister(ob);
			  System.out.println("Subscriber Unregistered");
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

	public void sendNotification(Notification notification, String memberId) {

		// Prepare notification message

		Notification notificn = notification.prepareNotification();
		NotificationContext ncxt = new NotificationContext();
		String memberIdentification = null;
		
		// Set strategy for notification mode
		
		
		AccountManager am= new AccountManager();
		Member m=am.retrieveMember(memberId);
		
		//Retrieve Member Preferences
		
		String pref="email";
		
	

		if ("email".equalsIgnoreCase(pref)) {

		
			ncxt.setNotifierStrategy(new EmailNotifierStrategy());
		}

		else if ("sms".equalsIgnoreCase(pref)) {
		
			ncxt.setNotifierStrategy(new SMSNotifierStrategy());
		}

		if (notificn != null)

		{

			ncxt.sendNotification(notificn);
		}

	}

}
