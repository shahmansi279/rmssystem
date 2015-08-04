package com.project.rms.request;

import java.util.Set;

import com.project.rms.service.ServiceType;
import com.project.rms.utils.GPSHelper;
import com.project.rms.vehicle.Vehicle;
import com.project.rms.vehicle.VehicleManager;

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
	VehicleManager vmgr;
	QueueManager q;
	static PriorityQueue<Request> pQueue;
	Request request;
	public Set<Request> requests;
	Vehicle vehicle;

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
		this.vmgr = new VehicleManager();

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public Request createRequest(String rPickLocAddr, String rDestLoc, Date rPickUpTime, ServiceType rServiceType,
			String rVehicle, String rFeature)

	{

		this.request = new Request();

		request.setrPickUpAddr(rPickLocAddr);
		request.setrDestAddr(rDestLoc);
		request.setrPickupDateTime(rPickUpTime);
		request.setrServiceType(rServiceType);
		request.setrFeature(rFeature);
		request.setrStatus("Created");
		request.setrState(new ProcessingState());
		request.executeAction(this);

		System.out.println("Request Created with ID : ");

		return request;

		// TODO implement me
	}

	public boolean validateRequest(Request r) {

		System.out.println("Validating Request Parameters");

		r.executeAction(this);
		return true;
	}

	public void updateRequestState() {

		// TODO implement me
	}

	public void updateRequest(String paramName, String newValue) {

		System.out.println("Updating Request");

		// TODO implement me
	}

	public void processRequest(Request r) {

		System.out.println("Retrieving Resources for the Requested Service Type");

		
		//Check Resource Availability and Allocate Resources
		
		fetchResource(r);
	
		allocateResources(r);
		
		
		Trip trip = generateTrip(request, vehicle);

		if (trip != null) {

			System.out.println("Generated Trip for Customer Request");

		}

	}

	public void sendNotifications() {
		// TODO implement me
	}

	// Adding Request to PQ

	public void addRequestToQueue(Request r) {
		this.q.addRequestToQueue(r);

		// TODO Auto-generated method stub

	}

	Vehicle fetchResource(Request r) {
		
		System.out.println("Checking Resource Pool for the Request");

		
		// Retrieving Contractor Owned or Company Owned Vehicle based on Request

		
		Vehicle v=null;
		
		//Vehicle v=vmgr.retrieveVehicle(r.getServiceType());
		
		if(v!=null)
			
		System.out.println("Acquired Resources for the Request");

		
		return v;

	}

	void allocateResources(Request r) {

		// Update vehicle and allocate it to trip
	
		// v.updateVehicleState(new )
		
		System.out.println("Allocated Vehicle for the Request");

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
			if (diffHours <= 2 && diffHours >= 0) {
				// updateRequestState();
				// processRequest();

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

	Trip generateTrip(Request r, Vehicle v) {

		Trip t = new Trip();
		t.setTripPickUpTime(r.getrPickupDateTime());
		t.setTripStatus("Initiated");
		t.setTripSource(r.getrPickUpAddr());
		t.setTripDest(r.getrDestAddr());
		t.setSvcType(r.getrServiceType() );
		t.setTripCustomers(r.getCustomers());

		return t;

	}
}
