package com.project.rms.notification;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class RecallNotification extends Notification implements Subject
{
	
	public List<Observer> observer;
	private String message;
    private boolean changed;
    private final Object MUTEX= new Object();
     
	public RecallNotification(){
		this.observer=new ArrayList<>();
	}
	
	public void appendMessage() {
		// TODO implement me	
		System.out.println("------------------------------");
		System.out.println("Recall Notification Available");
	}

	public void postMessage(String msg){
        System.out.println("Please take necessary action to repair your vehicle"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }
	
	@Override
	public void register(Observer obj) {
		// TODO Auto-generated method stub
		if(obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
        if(!observer.contains(obj)) observer.add(obj);
        }
		
	}

	@Override
	public void unregister(Observer obj) {
		// TODO Auto-generated method stub
		synchronized (MUTEX) {
	        observer.remove(obj);
	        }
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		List<Observer> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observer);
            this.changed=false;
        }
        for (Observer obj : observersLocal) {
            obj.update();
        }
	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	}
	
}

