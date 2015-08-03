package com.project.rms.accounts;


/**
 * 
 * Author:  Thiagarajan Natarajan
 * Purpose: Member CRUD operations
 * Date: 08/01/2015
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	

	public class AccountManager{
		//public static List<Member> members = new ArrayList<Member>();
		 Member sm1;
		 
		
		
		//add member
public  void addMembers(Member m,  List<Member> members1)
//This method add members to Member array members1
		{
		
	        
	        if (!members1.isEmpty())
	        {
	        	
	        	
	    	        sm1 = new Member(m.nMemberID,m.memFname,m.memLname,m.memEmail,m.memPhone,m.memAddress1,m.memAddress2,m.memCity,m.getMemState(),m.memZipcode,m.memPrefnotfn,m.memPrefpmt,m.memCreditcard,m.memPrimeflag);
	    	        members1.add(sm1);
	    	    
	    	    System.out.println("After adding the size of the members arraylist = "
	    				+ members1.size());
	    		//sortMembers(members);
	    		for (int i = 0; i < members1.size(); i++)
	    			
	    		{
	    	
	    				System.out.println("\n"+members1.get(i).getnMemberID()+ " " +members1.get(i).getMemFname()+" * "+ members1.get(i).getMemLname()+ " * "+members1.get(i).getMemEmail() + " * "+members1.get(i).getMemPhone());
	    				//System.out.println(members1.get(i).getMemLname());
	        	
	    		}
	  }//if
	        
		} //method end

	public AccountManager(){
		super();
	}

	
	
	public void addCustomer(String name) {
		
		Account a = new Account();
				a.setAcctUsername(name);
		// TODO implement me	
		
		
		//
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
public static void removeCustomer(String CustFName) {
		// TODO implement me	
		// This method is used to delete a member from the array
        {
        	
       
        	System.out.println("Printing after deletion..");
             
               for (int i = 0; i < AccountClient.members1.size(); i++) 
               {
            	        
                        if (AccountClient.members1.get(i).getMemFname().equalsIgnoreCase(CustFName))
                        {
                        	System.out.println("Member First name in delete "+AccountClient.members1.get(i).memFname);
                        	AccountClient.members1.remove(i);
                        }


                }
               System.out.println("Member has been deleted successfully!");
                System.out.println("Size of the list after delete operation is "
                                + AccountClient.members1.size());
        }

	}

public static void retrieveCustomer(String CustFName) 

{
	boolean retflag=false;
    	System.out.println("Printing after retrieving ..");	
    	
    	for (int i = 0; i < AccountClient.members1.size() && !retflag; i++) 
        {
     	        
                 if (AccountClient.members1.get(i).getMemFname().equalsIgnoreCase(CustFName))
                 {
                 	System.out.println("Member First name retrieved "+AccountClient.members1.get(i).memFname);
                 	retflag=true;
                 
                 }
                 
                 
                // System.out.println("Size of the list after retrieve operation is "+ AccountClient.members1.size());

         }
    	 if (retflag)
    	     System.out.println("Member has been retrieved successfully!");
    	 else 
    		 System.out.println("Member not found.. Pl try again..!");
    	
    }



public static void SearchCustomer(long CustId) {
	// TODO implement me	
	// This method is used to retrieve a member from the array
    {	

    	System.out.println("Printing after Searching..");	
    	boolean foundflag=false;
    	for (int i = 0; i < AccountClient.members1.size() && foundflag==false; i++) 
        {
     	        
                 if (AccountClient.members1.get(i).getnMemberID()== CustId)
                 {
                	System.out.println("Member found\n");
                	foundflag=true;
                 	System.out.println("Member details Searched "+AccountClient.members1.get(i).memFname+" "+ AccountClient.members1.get(i).getMemEmail());
                 	//AccountClient.members1.get(i).memFname= CustFName;
                 }
          

         }
    	 if (!foundflag)
         {
        	 System.out.println("Member is not found..Pl enter correct member ID");
        	 foundflag=true;
         }
    	
    	
    }
} 

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
public static void updateCustomer(String CustFName, String CEmail) {
	// TODO implement me	
	// This method is used to retrieve a member from the array
    {	
 
    	boolean updtflag=false;	
    	
    	for (int i = 0; i < AccountClient.members1.size() && !updtflag; i++) 
        {
     	        
                 if (AccountClient.members1.get(i).getMemFname().equalsIgnoreCase(CustFName))
                 {
                 	System.out.println("Member Email Updated for "+AccountClient.members1.get(i).memFname);
                 	AccountClient.members1.get(i).memEmail= CEmail;
                 	updtflag = true;
                 	System.out.println("Member has been updated successfully!");
                 }
         
         }
    	if (!updtflag)
    	       System.out.println("Member not found.. Pl enter correct customer first name");
    }
    
    }
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void sortCustomer() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	

public static void selectCustomer(String CustFName)

{
boolean selectflag=false;
		    	System.out.println("Printing after selecting ..");	
		    	
		    	for (int i = 0; i < AccountClient.members1.size() && !selectflag; i++) 
		        {
		     	        
		                 if (AccountClient.members1.get(i).getMemFname().equalsIgnoreCase(CustFName))
		                 {
		                	selectflag =true;
		                 	System.out.println("Selected Member * "+CustFName+" * Email address is *  "+AccountClient.members1.get(i).memEmail);
		                 	//AccountClient.members1.get(i).memFname= CustFName;
		                 }
		                 
		                 
		                

		         }
		    	if (selectflag)
		    	   System.out.println("Member has been selected successfully!");
		    	else 
		    		System.out.println("Member not found to select.. Pl enter correct membername");
		    	
		    }
		} 
		

	
	
	
	
	


