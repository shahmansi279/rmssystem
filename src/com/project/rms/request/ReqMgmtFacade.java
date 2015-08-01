package com.project.rms.request;

import java.util.Set;

import com.project.rms.utils.GPSHelper;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class ReqMgmtFacade {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	RequestComparator comparator;
	QueueManager q;
	static PriorityQueue<Request> pQueue;
	Request r;
	public Set<Request> request;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReqMgmtFacade() {
		super();
		comparator = new RequestComparator();

		this.pQueue = new PriorityQueue<Request>(comparator);
		this.q = new QueueManager(pQueue);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public Request createRequest(String rPickLocAddr, String rDestLoc, Date rPickUpTime, String rServiceType,
			String rVehicle, String rFeature)

	{

		GPSHelper g = new GPSHelper();
		Request r = new Request();

		r.setrPickLoc(g.getGPSLocation(rPickLocAddr));
		r.setrDestLoc(g.getGPSLocation(rDestLoc));
		r.setrPickupDateTime(rPickUpTime);
		r.setrServiceType(rServiceType);
		r.setrFeature(rFeature);
		r.setrStatus("Created");

		System.out.println("Request Created with ID : ");
		return r;

		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public void updateRequestState() {

		// TODO implement me
	}

	public void updateRequest() {

		// TODO implement me
	}

	public void processRequest() {
		// TODO implement me
	}

	public void sendNotifications() {
		// TODO implement me
	}

	// Adding Request to PQ

	public void addRequestToQueue(Request r) {
		this.q.addRequestToQueue(r);

		// TODO Auto-generated method stub

	}

	// Polling Request from PQ

	public Request pollRequestFromQueue() {

		return this.q.pickRequestFromQueue();

	}

	void manageQueueRequest() {

		Calendar cal = Calendar.getInstance();
		Date startDate = cal.getTime();
		Date endDate = retrieveRequestFromQueue().getrPickupDateTime();

		long diff = startDate.getTime() - endDate.getTime();
		System.out.println(diff);
		int diffHours = (int) (diff / (60 * 60 * 1000));
		System.out.println(diffHours);
		if (endDate != null) {
			if (diffHours <= 2&&diffHours>=0) {
				// updateRequestState();
				System.out.println("Yes its 2");
				this.q.removeRequestFromQueue();
				manageQueueRequest();

			} else {

				System.out.println("Time to stop");
			}
		}
	}

	private Request retrieveRequestFromQueue() {
		// TODO Auto-generated method stub
		return this.q.retrieveRequestFromQueue();
	}

}
