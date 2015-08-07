package com.project.rms.accounts;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import com.project.rms.notification.*;
  

/**
 * Author:  Thiagarajan Natarajan
 * Purpose: Member class with getters and setters
 * Date: 08/01/2015
 */

public abstract class Member
{
	String nMemberID; 
	String memFname;
	String memLname;
	String memEmail;
	String memPhone;  
	String memAddress1;
	String memAddress2;
	String memCity;
	String memState;
	String memZipcode;
	String memPrefnotfn;
	String memPrefpmt;
	String memCreditcard;
	String memPrimeflag;
	String memType;
	Account account;
	
	//Aug 4 2015
    List<Notification> an;
    String memRole;  // Aug 5 2015
	
	public String getMemRole() {
		return memRole;
	}



	public void setMemRole(String memRole) {
		this.memRole = memRole;
	}



	public List<Notification> getAn() {
		return an;
	}



	public void setAn(List<Notification> an) {
		this.an = an;
	}



	/*public Member( long i, String strmFName, String strmLName, String strmEmail, String strmPhone,
			String strmAddress1, String strmAddress2, String strmCity, String strmState, String strmZipcode,String strmPrefnotfn
	,String strmPrefpmt, String strmCreditcard, String strmPrimeflag )*/
	 public Member()
	{
		// TODO Auto-generated constructor stub
         //to do generate random number based on date and time - prefix cust
		
	 /*  this.memFname =strmFName;
	   this.memLname = strmLName;
	   this.memEmail = strmEmail;
	   this.memPhone = strmPhone;
	   this.memAddress1 = strmAddress1;
	   this.memAddress2 = strmAddress2;
	   this.memCity= strmCity;
	   this.memState = strmState;
	   this.memZipcode = strmZipcode;
	   this.memPrefnotfn = strmPrefnotfn;
	   this.memPrefpmt = strmPrefpmt;
	   this.memCreditcard = strmCreditcard;
	   this.memPrimeflag = strmPrimeflag;
	   this.nMemberID = i;*/
 
	   
	}

	
	
	/**
	 * @return the nMemberID
	 */
	public final String getnMemberID() {
		return nMemberID;
	}



	/**
	 * @param nMemberID the nMemberID to set
	 */
	public final void setnMemberID(String nMemberID) {
		this.nMemberID = nMemberID;
	}

	/**
	 * @return the memFname
	 */
	public final String getMemFname() {
		return memFname;
	}



	/**
	 * @param memFname the memFname to set
	 */
	public final void setMemFname(String memFname) {
		this.memFname = memFname;
	}



	/**
	 * @return the memLname
	 */
	public final String getMemLname() {
		return memLname;
	}



	/**
	 * @param memLname the memLname to set
	 */
	public final void setMemLname(String memLname) {
		this.memLname = memLname;
	}



	/**
	 * @return the memEmail
	 */
	public final String getMemEmail() {
		return memEmail;
	}



	/**
	 * @param memEmail the memEmail to set
	 */
	public final void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	/**
	 * @return the memPhone
	 */
	public final String getMemPhone() {
		return memPhone;
	}



	/**
	 * @param memPhone the memPhone to set
	 */
	public final void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	/**
	 * @return the memAddress1
	 */
	public final String getMemAddress1() {
		return memAddress1;
	}



	/**
	 * @param memAddress1 the memAddress1 to set
	 */
	public final void setMemAddress1(String memAddress1) {
		this.memAddress1 = memAddress1;
	}



	/**
	 * @return the memAddress2
	 */
	public final String getMemAddress2() {
		return memAddress2;
	}



	/**
	 * @param memAddress2 the memAddress2 to set
	 */
	public final void setMemAddress2(String memAddress2) {
		this.memAddress2 = memAddress2;
	}



	/**
	 * @return the memCity
	 */
	public final String getMemCity() {
		return memCity;
	}



	/**
	 * @param memCity the memCity to set
	 */
	public final void setMemCity(String memCity) {
		this.memCity = memCity;
	}



	/**
	 * @return the memState
	 */
	public final String getMemState() {
		return memState;
	}



	/**
	 * @param memState the memState to set
	 */
	public final void setMemState(String memState) {
		this.memState = memState;
	}



	/**
	 * @return the memZipcode
	 */
	public final String getMemZipcode() {
		return memZipcode;
	}



	/**
	 * @param memZipcode the memZipcode to set
	 */
	public final void setMemZipcode(String memZipcode) {
		this.memZipcode = memZipcode;
	}



	/**
	 * @return the memPrefnotfn
	 */
	public final String getMemPrefnotfn() {
		return memPrefnotfn;
	}



	/**
	 * @param memPrefnotfn the memPrefnotfn to set
	 */
	public final void setMemPrefnotfn(String memPrefnotfn) {
		this.memPrefnotfn = memPrefnotfn;
	}



	/**
	 * @return the memPrefpmt
	 */
	public final String getMemPrefpmt() {
		return memPrefpmt;
	}



	/**
	 * @param memPrefpmt the memPrefpmt to set
	 */
	public final void setMemPrefpmt(String memPrefpmt) {
		this.memPrefpmt = memPrefpmt;
	}



	/**
	 * @return the memCreditcard
	 */
	public final String getMemCreditcard() {
		return memCreditcard;
	}



	/**
	 * @param memCreditcard the memCreditcard to set
	 */
	public final void setMemCreditcard(String memCreditcard) {
		this.memCreditcard = memCreditcard;
	}



	/**
	 * @return the memPrimeflag
	 */
	public final String getMemPrimeflag() {
		return memPrimeflag;
	}



	/**
	 * @param memPrimeflag the memPrimeflag to set
	 */
	public final void setMemPrimeflag(String memPrimeflag) {
		this.memPrimeflag = memPrimeflag;
	}
	public final String getMemType() {
		return memType;
	}



	public void setMemType(String memType) {
		this.memType = memType;
	}


	/**
	 * @return the account
	 */
	public final Account getAccount() {
		return account;
	}



	/**
	 * @param account the account to set
	 */
	public final void setAccount(Account account) {
		this.account = account;
	}


	

}

