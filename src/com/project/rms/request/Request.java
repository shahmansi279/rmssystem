package com.project.rms.request;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

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
	public String rServiceTypeDesc;
	public HashMap<String, String> rFeature;
	public ServiceType svcType;
	public Service svcName;
	ReqMgmtFacade reqMgmtFacade;
	String memberId;

	RequestState processingSt = null;
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

	}
	
	

	public String getMemberId() {
		return memberId;
	}



	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public HashMap<String, String> getrFeature() {
		return rFeature;
	}

	public void setrFeature(HashMap<String, String> rFeature) {
		this.rFeature = rFeature;
	}

	public ReqMgmtFacade getReqMgmtFacade() {
		return reqMgmtFacade;
	}

	public void setReqMgmtFacade(ReqMgmtFacade reqMgmtFacade) {
		this.reqMgmtFacade = reqMgmtFacade;
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

		this.rState.execute(this, reqMgmtFacade2);
		// TODO Auto-generated method stub

	}

	public String getrServiceTypeDesc() {
		return rServiceTypeDesc;
	}

	public void setrServiceTypeDesc(String serviceType) {
		this.rServiceTypeDesc = serviceType;
	}

	public ServiceType getSvcType() {
		return svcType;
	}

	public void setSvcType(ServiceType svcType) {
		this.svcType = svcType;
	}

	public Service getSvcName() {
		return svcName;
	}

	public void setSvcName(Service svcName) {
		this.svcName = svcName;
	}

}
