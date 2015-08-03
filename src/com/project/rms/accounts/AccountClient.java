package com.project.rms.accounts;
import java.util.ArrayList;
import java.util.List;
/*
 * Author:  Thiagarajan Natarajan
 * Purpose: Client code to show the menu option and get customer information
 * Date: 08/01/2015
 */


import java.util.Scanner;
public class AccountClient {
public static  List<Member> members1 = new ArrayList<Member>();
public static void main(String[] args) {
			// TODO Auto-generated method stub
			Member member;
			//List<Member> members = new ArrayList<Member>();

			//CarList carlist = new CarList();

			//Scanner s = new Scanner(System.in);
			Scanner console1;
			long i=0, custID=1;
			String strmFName = null; 
			String strmLName = null; 
			String strmEmail = null; 
			String strmPhone = null;
			String strmAddress1 = null; 
			String strmAddress2 = null; 
			String strmCity = null; 
			String strmState = null; 
			String strmZipcode = null;
			String strmPrefnotfn = null;
			String strmPrefpmt = null; 
			String strmCreditcard = null; 
			String strmPrimeflag = null;
			int choice;
			AccountManager mops = new AccountManager();
		  // public static List<Member> members1 = new ArrayList<Member>();
			Member smem1;
			member = new Member(1, "Thiagu", "Natar", null, null, null, null, null, null, null, null, null, null, null);
			//  mops.addMembers(member);
			//Initialize member array 

			smem1 = new Member(1,"Cust1Fname","Cust1Lname","Cust01@yahoo.com","4085550001","Cust1 Address1","Cust1 Address2","Cust1 City","Cust1 State","90001","Email","Cash","1234567890120001","Y");
		//members1.add(smem1,members1);
			members1.add(smem1);
			//mops.addMembers(smem1);
			
			smem1 = new Member(2,"Cust2Fname","Cust2Lname","Cust02@yahoo.com","4085550002","Cust2 Address1","Cust2 Address2","Cust2 City","Cust2 State","90002","Email","CreditCard","1234567890120002","Y");
		   members1.add(smem1);
		//	mops.addMembers(smem1);
		   
		   smem1 = new Member(3,"Cust3Fname","Cust3Lname","Cust03@yahoo.com","4085550003","Cust3 Address1","Cust3 Address2","Cust3 City","Cust3 State","90003","SMS","Cash","1234567890120003","Y");
		    members1.add(smem1);
		    smem1 = new Member(4,"Cust4Fname","Cust4Lname","Cust04@yahoo.com","4085550004","Cust4 Address1","Cust4 Address2","Cust4 City","Cust4 State","90004","Email","Cash","1234567890120004","Y");
		    members1.add(smem1);
		    smem1 = new Member(5,"Cust5Fname","Cust5Lname","Cust05@yahoo.com","4085550005","Cust5 Address1","Cust5 Address2","Cust5 City","Cust5 State","90005","Email","Cash","1234567890120005","Y");
		    members1.add(smem1);
		    smem1 = new Member(6,"Cust6Fname","Cust6Lname","Cust06@yahoo.com","4085550006","Cust6 Address1","Cust6 Address2","Cust6 City","Cust6 State","90006","Email","Cash","1234567890120006","N");
		    members1.add(smem1);
		    smem1 = new Member(7,"Cust7Fname","Cust7Lname","Cust07@yahoo.com","4085550007","Cust7 Address1","Cust7 Address2","Cust7 City","Cust7 State","90007","Email","Cash","1234567890120007","Y");
		    members1.add(smem1);
		    smem1 = new Member(8,"Cust8Fname","Cust8Lname","Cust08@yahoo.com","4085550008","Cust8 Address1","Cust8 Address2","Cust8 City","Cust8 State","90008","Email","Cash","1234567890120008","Y");
		    members1.add(smem1);
		    smem1 = new Member(9,"Cust9Fname","Cust9Lname","Cust09@yahoo.com","4085550009","Cust9 Address1","Cust9 Address2","Cust9 City","Cust9 State","90009","Email","Cash","1234567890120009","Y");
		    members1.add(smem1);
		    smem1 = new Member(10,"Cust10Fname","Cust10Lname","Cust10@yahoo.com","4085550010","Cust10 Address1","Cust10 Address2","Cust10 City","Cust10 State","90010","Email","Cash","1234567890120010","N");
		    members1.add(smem1);

		   
			do {

				System.out.println("RIDE MANAGEMENT SYSTEM - Membership Management - SystemAdmin ");
				System.out.println("=============================================================");
				System.out.println("1. Add Member");
				System.out.println("2. Retrieve Member");
				System.out.println("3. Update Member");
				System.out.println("4. Delete Members");
				System.out.println("5. Select Members");
				System.out.println("6. Search Members");
				System.out.println("7. Sort Members");
				System.out.println("8. Back");
				System.out.println("9. Exit");
				System.out.println("Enter your option(1,2,3,4,5,6,7,8,9)");


				console1 = new Scanner(System.in);
				choice = console1.nextInt();
				console1.nextLine();

				if (choice == 1)

				{
					System.out.println("Adding members");
					System.out.println("Adding Member Information");
					System.out.println("Enter Member First Name");
					console1 = new Scanner(System.in);
					strmFName = (console1.nextLine());
					System.out.println("Enter Member Last Name");
					console1 = new Scanner(System.in);
					strmLName = (console1.nextLine());
					System.out.println("Enter Member Email");
					console1 = new Scanner(System.in);
					strmEmail = (console1.nextLine());
					System.out.println("Enter Member Phone Number ");
					console1 = new Scanner(System.in);
					strmPhone = (console1.nextLine());
					System.out.println("Enter Member Address 1 ");
					console1 = new Scanner(System.in);
					strmAddress1 = (console1.nextLine());
					System.out.println("Enter Member Address 2 ");
					console1 = new Scanner(System.in);
					strmAddress2 = (console1.nextLine());
					System.out.println("Enter City ");
					console1 = new Scanner(System.in);
					strmCity = (console1.nextLine());
					System.out.println("Enter State ");
					console1 = new Scanner(System.in);
					strmState = (console1.nextLine());
					System.out.println("Enter Zip ");
					console1 = new Scanner(System.in);
					strmZipcode = (console1.nextLine());
					System.out.println("Enter Preferred Notification Method ");
					console1 = new Scanner(System.in);
					strmPrefnotfn = (console1.nextLine());
					System.out.println("Enter Preferred Payment Method ");
					console1 = new Scanner(System.in);
					strmPrefpmt = (console1.nextLine());
					System.out.println("Enter Customer Credit Card Number ");
					console1 = new Scanner(System.in);
					strmCreditcard = (console1.nextLine());
					System.out.println("Enter Prime Member Flag ");
					console1 = new Scanner(System.in);
					strmPrimeflag = (console1.nextLine());
					
					/* passing the values from the scanner */
					// insert memberId based on the current array size
					member.nMemberID = members1.size()+1;
					member.setMemFname(strmFName);
					member.setMemLname(strmLName);
					member.setMemEmail(strmEmail);
					member.setMemPhone(strmPhone);
					member.setMemAddress1(strmAddress1);
					member.setMemAddress2(strmAddress2);
					member.setMemCity(strmCity);
					member.setMemState(strmState);
					member.setMemZipcode(strmZipcode);
					member.setMemPrefnotfn(strmPrefnotfn);
					member.setMemPrefpmt(strmPrefpmt);
					member.setMemCreditcard(strmCreditcard);
					member.setMemPrimeflag(strmPrimeflag);
					
					//mops.addMembers(member);
					mops.addMembers(member, members1);
					//mops.addMembers(member);

				}

				if (choice == 2)	
				{
					System.out.println("Retrieving Member ");
					System.out.println("Enter Member First Name");
					console1 = new Scanner(System.in);
					strmFName = (console1.nextLine());
				   mops.retrieveCustomer(strmFName);
				  			
				}  

				if (choice == 3)	
				{
					System.out.println("Updating Member ");
					System.out.println("Enter Member First Name");
					console1 = new Scanner(System.in);
					strmFName = (console1.nextLine());
					System.out.println("Enter new email address");
					console1 = new Scanner(System.in);
					strmEmail = (console1.nextLine());
				   mops.updateCustomer(strmFName,strmEmail);
				  			
				}
				
				if (choice == 4)	
				{
					System.out.println("Removing Member ");
					System.out.println("Enter Member First Name");
					console1 = new Scanner(System.in);
					strmFName = (console1.nextLine());
				   mops.removeCustomer(strmFName);
				   //print after deletion
				   System.out.println("Members list after removing a member ");
				   for (int j=0; j< members1.size();j++)
				   {
					  System.out.println("First Name = "+members1.get(j).memFname);
					   
				   }
					//mops.addMembers(member);
					//	member.addMembers(member);				
				}						
				
				if (choice == 5)	
				{
					System.out.println("Select Member - Enter Member First Name ");
					console1 = new Scanner(System.in);
					strmFName = (console1.nextLine());
					System.out.println("Displaying Selected Member email information ");
					mops.selectCustomer(strmFName);
					
									
				}	
				
				if (choice == 6)	
				{
					System.out.println("Search Member based on MemberId ");
					console1 = new Scanner(System.in);
					custID=console1.nextLong();
					mops.SearchCustomer(custID);
					
						
				}	
				
				if (choice == 7)	
				{
					System.out.println("Sorting Member ");
							
				}	



			} while (choice != 9);
			
			/*
			 * long i=0; String strmFName = null; String strmLName = null; String strmEmail = null; String strmPhone = null;
				String strmAddress1 = null; String strmAddress2 = null; String strmCity = null; String strmState = null; String strmZipcode = null;String strmPrefnotfn = null;
		String strmPrefpmt = null; String strmCreditcard = null; String strmPrimeflag = null;
			 * 
			 */


		}

	
		
		
		//take input from customer
		
		
		//AccountManager am= new AccountManager();
		//am.addCustomer("");
		
		
		
}
