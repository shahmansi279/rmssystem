package com.project.rms.notification;

import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface Subject 
{
	/*protected String symbol;
	protected double mess;
	private ArrayList obs = new ArrayList();
	
	public Subject(){
		
	}
	
	public void addObserver(Observer observer){
		obs.add(observer);
	}
	
	public void deleteObserver(Observer observer){
		obs.remove(observer);
		
	}
	
	public void notifyObservers(Object args){
		//Iterator i = 
	}
	*/
	public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers();
    public Object getUpdate(Observer obj);
}

