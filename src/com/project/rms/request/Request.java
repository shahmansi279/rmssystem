package com.project.rms.request;

import java.sql.Timestamp;
import java.util.Date;

import com.project.rms.utils.GPSLocation;

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


	public Date rCreationDateTime;
	public Date rPickupDateTime;

	public String rStatus;

	public String rServiceType;

	public String rFeature;



	public String rId;
	public int rCount;


	public int getrCount() {
		return rCount;
	}

	public void setrCount(int rCount) {
		this.rCount = rCount;
	}


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

	

	

	public void setrCreationDateTime(Timestamp rCreationDateTime) {
		this.rCreationDateTime = rCreationDateTime;
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

