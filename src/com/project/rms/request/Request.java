package com.project.rms.request;

import java.sql.Timestamp;

import com.project.utils.GPSLocation;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Request


{

	public GPSLocation getrPickLoc() {
		return rPickLoc;
	}

	public void setrPickLoc(GPSLocation rPickLoc) {
		this.rPickLoc = rPickLoc;
	}

	public GPSLocation getrDestLoc() {
		return rDestLoc;
	}

	public void setrDestLoc(GPSLocation rDestLoc) {
		this.rDestLoc = rDestLoc;
	}


	public GPSLocation rPickLoc;

	public GPSLocation rDestLoc;

	public Timestamp rCreationDateTime;
	public Timestamp rPickupDateTime;

	public String rStatus;

	public String rServiceType;

	public String rFeature;



	public String rId;



	public String rState;


	public String getrStatus() {
		return rStatus;
	}

	public void setrStatus(String rStatus) {
		this.rStatus = rStatus;
	}
	public String getrState() {
		return rState;
	}

	public void setrState(String rState) {
		this.rState = rState;
	}

	

	public Timestamp getrCreationDateTime() {
		return rCreationDateTime;
	}

	public void setrCreationDateTime(Timestamp rCreationDateTime) {
		this.rCreationDateTime = rCreationDateTime;
	}

	public Timestamp getrPickupDateTime() {
		return rPickupDateTime;
	}

	public void setrPickupDateTime(Timestamp rPickupDateTime) {
		this.rPickupDateTime = rPickupDateTime;
	}

	public String getrServiceType() {
		return rServiceType;
	}

	public void setrServiceType(String rServiceType) {
		this.rServiceType = rServiceType;
	}

	public String getrFeature() {
		return rFeature;
	}

	public void setrFeature(String rFeature) {
		this.rFeature = rFeature;
	}

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	public ReqMgmtFacade getReqMgmtFacade() {
		return reqMgmtFacade;
	}

	public void setReqMgmtFacade(ReqMgmtFacade reqMgmtFacade) {
		this.reqMgmtFacade = reqMgmtFacade;
	}


	public ReqMgmtFacade reqMgmtFacade;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Request(){
		super();
	}

}

