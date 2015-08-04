package com.project.rms.request;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import com.project.rms.accounts.Member;
import com.project.rms.service.Service;
import com.project.rms.service.ServiceType;
import com.project.rms.utils.GPSLocation;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class Request

{
	public Date rCreationDateTime;
		public Date rPickupDateTime;
	public String rStatus;
	public ServiceType rServiceType;
	public String rFeature;

	ReqMgmtFacade reqMgmtFacade;

	Member customer;
	ArrayList<Member> customers;
	RequestState processingSt=null;
	RequestState processedSt;
	RequestState queuedSt;
	RequestState acceptedSt;
	RequestState rejectedSt;
	RequestState allocatingSt;

	RequestState rState;

	String rId;
	int rCount;
	GPSLocation rPickGPSLoc;
	GPSLocation rDestGPSLoc;

	String rPickUpAddr;
	String rDestAddr;
	
	Request() {
		
		processingSt = new ProcessingState();

		/*

		* processedSt = new ProcessedState(); queuedSt = new QueuedState();

		* acceptedSt = new AcceptedState(); rejectedSt = new RejectedState();

		* allocatingSt = new AllocatingState();

		*/
	}

	

	public String getrDestAddr() {
		return rDestAddr;
	}



	public void setrDestAddr(String rDestAddr) {
		this.rDestAddr = rDestAddr;
	}



	public Date getrCreationDateTime() {
		return rCreationDateTime;
	}

	public void setrCreationDateTime(Date rCreationDateTime) {
		this.rCreationDateTime = rCreationDateTime;
	}

	public Date getrPickupDateTime() {
		return rPickupDateTime;
	}

	public void setrPickupDateTime(Date rPickupDateTime) {
		this.rPickupDateTime = rPickupDateTime;
	}
	
	public String getrStatus() {
		return rStatus;
	}

	public void setrStatus(String rStatus) {
		this.rStatus = rStatus;
	}

	
	public void setrCreationDateTime(Timestamp rCreationDateTime) {
		this.rCreationDateTime = rCreationDateTime;
	}

	
	


	public String getrFeature() {
		return rFeature;
	}

	public void setrFeature(String rFeature) {
		this.rFeature = rFeature;
	}
	
	
	public ReqMgmtFacade getReqMgmtFacade() {
		return reqMgmtFacade;
	}



	public void setReqMgmtFacade(ReqMgmtFacade reqMgmtFacade) {
		this.reqMgmtFacade = reqMgmtFacade;
	}



	public Member getCustomer() {
		return customer;
	}



	public void setCustomer(Member customer) {
		this.customer = customer;
	}



	public ArrayList<Member> getCustomers() {
		return customers;
	}



	public void setCustomers(ArrayList<Member> customers) {
		this.customers = customers;
	}



	public RequestState getrState() {
		return rState;
	}



	public void setrState(RequestState rState) {
		this.rState = rState;
	}



	public String getrId() {
		return rId;
	}



	public void setrId(String rId) {
		this.rId = rId;
	}



	public int getrCount() {
		return rCount;
	}



	public void setrCount(int rCount) {
		this.rCount = rCount;
	}



	public GPSLocation getrPickGPSLoc() {
		return rPickGPSLoc;
	}



	public void setrPickGPSLoc(GPSLocation rPickGPSLoc) {
		this.rPickGPSLoc = rPickGPSLoc;
	}



	public GPSLocation getrDestGPSLoc() {
		return rDestGPSLoc;
	}



	public void setrDestGPSLoc(GPSLocation rDestGPSLoc) {
		this.rDestGPSLoc = rDestGPSLoc;
	}



	public String getrPickUpAddr() {
		return rPickUpAddr;
	}



	public void setrPickUpAddr(String rPickUpAddr) {
		this.rPickUpAddr = rPickUpAddr;
	}



	public void executeAction(ReqMgmtFacade reqMgmtFacade2) {
		
		this.rState.execute(this,reqMgmtFacade2);
		// TODO Auto-generated method stub
		
	}



	public ServiceType getrServiceType() {
		return rServiceType;
	}



	public void setrServiceType(ServiceType rServiceType) {
		this.rServiceType = rServiceType;
	}



}
