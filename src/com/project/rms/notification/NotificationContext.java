package com.project.rms.notification;

public class NotificationContext
{
	
	private NotifierStrategy notifier;
	
	public NotificationManager notificationManager;
	
	public NotificationContext(){
		super();
	}
	
	public NotifierStrategy setStrategy(String memPrefnotfn){
		if ("email".equalsIgnoreCase(memPrefnotfn)){
			notifier = new EmailNotifierStrategy();
		}
		
		else if ("sms".equalsIgnoreCase(memPrefnotfn)){
			notifier = new SMSNotifierStrategy();
		}
		return notifier;
	}

}

