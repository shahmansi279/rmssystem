package com.project.rms.request;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class QueueManager {

	RequestComparator comparator;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	PriorityQueue<Request> pQueue;

	public QueueManager(PriorityQueue<Request> pQueue) {
		super();

		this.pQueue = pQueue;
	}

	//Add Request to Pqueue
	
	boolean addRequestToQueue(Request r)

	{

		return pQueue.add(r);

	}

	public Request pickRequestFromQueue() {

		return pQueue.poll();

	}
	
	public Request removeRequestFromQueue(){
		
		return pQueue.remove();
	}

public Request retrieveRequestFromQueue(){
		
		return pQueue.peek();
	}

}
