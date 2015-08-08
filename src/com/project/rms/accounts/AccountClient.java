package com.project.rms.accounts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * Author:  Thiagarajan Natarajan
 * Purpose: Client code to show the menu option and get customer information
 * Date: 08/01/2015
 */

public class AccountClient

{

	Scanner console1;
	public long custid = 9;
	public long sysadmid = 2;
	public long sysownerid = 2;
	public long serviceproid = 2;
	public String custID = "1";
	public String strmFName = null;
	public String strmLName = null;
	public String strmEmail = null;
	public String strmPhone = null;
	public String strmAddress1 = null;
	public String strmAddress2 = null;
	public String strmCity = null;
	public String strmState = null;
	public String strmZipcode = null;
	public String strmPrefnotfn = null;
	public String strmPrefpmt = null;
	public String strmCreditcard = null;
	public String strmPrimeflag = null;
	public int choice;
	public String strmmemType = null;
	// Aug 7 morning
	public static List<Member> members1 = new ArrayList<Member>();
	public Customer member1;
	public SystemAdmin member2;
	public ServiceProvider member3;
	public SystemOwner member4;
	AccountManager mops = new AccountManager();

	public AccountClient(){
		
		
	}

	public void processRequest() {

		member1 = new Customer("Cust002", "Parth", "Cust2Lname", "Cust02@yahoo.com", "4085550002", "Cust2 Address1",
				"Cust2 Address2", "Cust2 City", "Cust2 State", "90002", "Email", "Cash", "1234567890120002", "Y",
				"PREMIER", "C");

		members1.add(member1);
		member1 = new Customer("Cust003", "Mansi", "Cust3Lname", "Cust03@yahoo.com", "4085550003", "Cust3 Address1",
				"Cust3 Address2", "Cust3 City", "Cust3 State", "90003", "Email", "CreditCard", "1234567890120003", "Y",
				"GUEST", "C");
		members1.add(member1);
		member1 = new Customer("Cust004", "Jessie", "Cust4Lname", "Cust04@yahoo.com", "4085550004", "Cust4 Address1",
				"Cust4 Address2", "Cust4 City", "Cust4 State", "90004", "SMS", "Cash", "1234567890120004", "Y",
				"PREMIER", "C");
		members1.add(member1);
		member1 = new Customer("Cust005", "Zebra", "Cust5Lname", "Cust05@yahoo.com", "4085550005", "Cust5 Address1",
				"Cust5 Address2", "Cust5 City", "Cust5 State", "90005", "Email", "Cash", "1234567890120005", "Y",
				"PREMIER", "C");
		members1.add(member1);
		member1 = new Customer("Cust006", "Amogh", "Cust6Lname", "Cust06@yahoo.com", "4085550006", "Cust6 Address1",
				"Cust6 Address2", "Cust6 City", "Cust6 State", "90006", "Email", "Cash", "1234567890120006", "Y",
				"PREMIER", "C");
		members1.add(member1);
		member1 = new Customer("Cust007", "Jack", "Cust7Lname", "Cust07@yahoo.com", "4085550007", "Cust7 Address1",
				"Cust7 Address2", "Cust7 City", "Cust7 State", "90007", "Email", "Cash", "1234567890120007", "N",
				"GUEST", "C");
		members1.add(member1);
		member1 = new Customer("Cust008", "Barbara", "Cust8Lname", "Cust08@yahoo.com", "4085550008", "Cust8 Address1",
				"Cust8 Address2", "Cust8 City", "Cust8 State", "90008", "Email", "Cash", "1234567890120008", "Y",
				"PREMIER", "C");
		members1.add(member1);
		member1 = new Customer("Cust009", "Robert", "Cust9Lname", "Cust09@yahoo.com", "4085550009", "Cust9 Address1",
				"Cust9 Address2", "Cust9 City", "Cust9 State", "90009", "Email", "Cash", "1234567890120009", "Y",
				"PREMIER", "C");
		members1.add(member1);

		// Aug 6 2015
		member2 = new SystemAdmin("SysAdm001", "RajSysadmin", "Natar", null, null, null, null, null, null, null, null,
				null, null, null, "GUEST", "S");
		members1.add(member2);
		member2 = new SystemAdmin("SysAdm002", "SysFname", "Sys2Lname", "Sysadm02@yahoo.com", "4085550002",
				"sysadm2 Address1", "sysadm2 Address2", "sysadm2 City", "sysadm2 State", "90002", "Email", "CreditCard",
				"1234567890120002", "Y", "SysAdmin002", "S");
		members1.add(member2);
		member3 = new ServiceProvider("Provider001", "NTServiceprovider", "Natar", null, null, null, null, null, null,
				null, null, null, null, null, "GUEST", "D");
		members1.add(member3);
		member3 = new ServiceProvider("Provider002", "SvcProv2Fname", "SvcProv2Lname", "SvcProv2@yahoo.com",
				"4085550002", "Prov2 Address1", "Prov2 Address2", "Prov2 City", "Prov2 State", "90002", "Email",
				"CreditCard", "1234567890120002", "Y", "SP1", "D");
		members1.add(member3);
		member4 = new SystemOwner("SysOwn001", "Owner1Fname", "Owner1Natar", "Owner1@yahoo.com", null, null, null, null,
				null, null, null, null, null, null, "GUEST", "O");
		members1.add(member4);
		member4 = new SystemOwner("SysOwn002", "Owner2Fname", "Owner2Rob", "Owner2@yahoo.com", "4085550002",
				"Owner2 Address1", "Owner2 Address2", "Owner2 City", "Owner2 State", "90002", "Email", "CreditCard",
				"1234567890120002", "Y", "SP1", "O");
		members1.add(member4);

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
				collectInput();
				addanyMember();
			}

			// String id = "10";
			// Aug 6
			/*
			 * else SystemAdmin member if role = sysadmin smem2 if role =
			 * Servieprovider use smem3 here instead of member smem1.nMemberID =
			 * "111" + id; smem2.nMemberID = "555" + id; smem3.nMemberID = "777"
			 * + id; copy paste till mops.addMembers(smem1,memebers1)
			 * 
			 */
			// Aug 7 replace the below lines with the method

			if (choice == 2) {
				System.out.println("Retrieving Member ");
				System.out.println("Enter Member Id to be retrieved");
				console1 = new Scanner(System.in);
				strmFName = (console1.nextLine());
				mops.retrieveCustomer(strmFName);

			}

			if (choice == 3) {
				System.out.println("Updating Member ");
				System.out.println("Enter Member First Name");
				console1 = new Scanner(System.in);
				strmFName = (console1.nextLine());
				System.out.println("Enter new email address");
				console1 = new Scanner(System.in);
				strmEmail = (console1.nextLine());
				mops.updateCustomer(strmFName, strmEmail);

			}

			if (choice == 4) {
				System.out.println("Removing Member ");
				System.out.println("Enter Member First Name");
				console1 = new Scanner(System.in);
				strmFName = (console1.nextLine());
				mops.removeCustomer(strmFName);
				// print after deletion
				System.out.println("Members list after removing a member ");
				for (int j = 0; j < members1.size(); j++) {
					System.out.println("First Name = " + members1.get(j).memFname + " Member Id = "
							+ members1.get(j).nMemberID + " Member role= " + members1.get(j).memRole);
				}
				// mops.addMembers(member);
				// member.addMembers(member);
			}

			if (choice == 5) {
				System.out.println("Select Member - Enter Member First Name ");
				console1 = new Scanner(System.in);
				strmFName = (console1.nextLine());
				System.out.println("Displaying Selected Member email information ");
				mops.selectCustomer(strmFName);

			}

			if (choice == 6) {
				System.out.println("Search Member based on MemberId ");
				console1 = new Scanner(System.in);
				custID = (console1.nextLine());
				mops.SearchCustomer(custID);

			}

			if (choice == 7) {
				System.out.println("Sorting Members ");

				// Sort members based on their name

				// Collections.sort(members1, new SortComparator());
				mops.sortCustomers();

			}

		} while (choice != 9);

		/*
		 * long i=0; String strmFName = null; String strmLName = null; String
		 * strmEmail = null; String strmPhone = null; String strmAddress1 =
		 * null; String strmAddress2 = null; String strmCity = null; String
		 * strmState = null; String strmZipcode = null;String strmPrefnotfn =
		 * null; String strmPrefpmt = null; String strmCreditcard = null; String
		 * strmPrimeflag = null;
		 * 
		 */
	}

	// take input from customer

	// AccountManager am= new AccountManager();
	// am.addCustomer("");

	// collectInput()

	public void collectInput()

	{
		// Scanner console1;
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
		System.out.println("Enter Member type: Customer/Sysadmin/Service Provider/Owner(C/S/D/O)");
		console1 = new Scanner(System.in);
		strmmemType = (console1.nextLine());

	}

	public void addanyMember()

	{

		/*
		 * member.setnMemberID("111"); member.setMemFname(strmFName);
		 * member.setMemLname(strmLName); member.setMemEmail(strmEmail);
		 * member.setMemPhone(strmPhone); member.setMemAddress1(strmAddress1);
		 * member.setMemAddress2(strmAddress2); member.setMemCity(strmCity);
		 * member.setMemState(strmState); member.setMemZipcode(strmZipcode);
		 * member.setMemPrefnotfn(strmPrefnotfn);
		 * member.setMemPrefpmt(strmPrefpmt);
		 * member.setMemCreditcard(strmCreditcard);
		 * member.setMemPrimeflag(strmPrimeflag);
		 * 
		 * member.setMemType(strmmemType);
		 */
		/*
		 * member1 = new Customer("Cust000", "Thiagucustomer", "Natar", null,
		 * null, null, null, null, null, null, null, null, null,
		 * null,"GUEST","C"); member2 = new SystemAdmin("SysAdm000",
		 * "RajSysadmin", "Natar", null, null, null, null, null, null, null,
		 * null, null, null, null,"GUEST","S"); member3 = new
		 * ServiceProvider("Provider000", "NTServiceprovider", "Natar", null,
		 * null, null, null, null, null, null, null, null, null,
		 * null,"GUEST","D"); member4 = new SystemOwner("SysOwn000", "",
		 * "Natar", null, null, null, null, null, null, null, null, null, null,
		 * null,"GUEST","O");
		 */
		// C/S/D/O
		/*
		 * public long custid = 0; public long sysadmid = 0; public long
		 * sysownerid=0; public long serviceproid=0;
		 */
		switch (strmmemType) {

		case "C": {
			System.out.println("Member type = " + strmmemType);
			custid++;
			member1 = new Customer("null", "null", "Natar", null, null, null, null, null, null, null, null, null, null,
					null, "GUEST", "D");
			member1.setnMemberID("Cust00" + custid);
			member1.setMemFname(strmFName);
			member1.setMemLname(strmLName);
			member1.setMemEmail(strmEmail);
			member1.setMemPhone(strmPhone);
			member1.setMemAddress1(strmAddress1);
			member1.setMemAddress2(strmAddress2);
			member1.setMemCity(strmCity);
			member1.setMemState(strmState);
			member1.setMemZipcode(strmZipcode);
			member1.setMemPrefnotfn(strmPrefnotfn);
			member1.setMemPrefpmt(strmPrefpmt);
			member1.setMemCreditcard(strmCreditcard);
			member1.setMemPrimeflag(strmPrimeflag);
			member1.setMemType(strmmemType);
			mops.addMembers(member1, members1);
			break;
		}

		case "S":

		{
			System.out.println("Member type = " + strmmemType);
			sysadmid++;
			member2 = new SystemAdmin("null", "null", "Natar", null, null, null, null, null, null, null, null, null,
					null, null, "GUEST", "D");
			member2.setnMemberID("SYSADM00" + sysadmid);
			member2.setMemFname(strmFName);
			member2.setMemLname(strmLName);
			member2.setMemEmail(strmEmail);
			member2.setMemPhone(strmPhone);
			member2.setMemAddress1(strmAddress1);
			member2.setMemAddress2(strmAddress2);
			member2.setMemCity(strmCity);
			member2.setMemState(strmState);
			member2.setMemZipcode(strmZipcode);
			member2.setMemPrefnotfn(strmPrefnotfn);
			member2.setMemPrefpmt(strmPrefpmt);
			member2.setMemCreditcard(strmCreditcard);
			member2.setMemPrimeflag(strmPrimeflag);
			member2.setMemType(strmmemType);
			mops.addMembers(member2, members1);
			break;

		}

		case "D": {
			System.out.println("Member type = " + strmmemType);
			serviceproid++;
			member3 = new ServiceProvider("null", "null", "Natar", null, null, null, null, null, null, null, null, null,
					null, null, "GUEST", "D");
			member3.setnMemberID("Provider00" + serviceproid);
			member3.setMemFname(strmFName);
			member3.setMemLname(strmLName);
			member3.setMemEmail(strmEmail);
			member3.setMemPhone(strmPhone);
			member3.setMemAddress1(strmAddress1);
			member3.setMemAddress2(strmAddress2);
			member3.setMemCity(strmCity);
			member3.setMemState(strmState);
			member3.setMemZipcode(strmZipcode);
			member3.setMemPrefnotfn(strmPrefnotfn);
			member3.setMemPrefpmt(strmPrefpmt);
			member3.setMemCreditcard(strmCreditcard);
			member3.setMemPrimeflag(strmPrimeflag);
			member3.setMemType(strmmemType);
			mops.addMembers(member3, members1);
			break;
		}
		case "O": {
			System.out.println("Member type = " + strmmemType);
			sysownerid++;
			member4 = new SystemOwner("null", "null", "Natar", null, null, null, null, null, null, null, null, null,
					null, null, "GUEST", "D");
			member4.setnMemberID("SysOwn00" + sysownerid);
			member4.setMemFname(strmFName);
			member4.setMemLname(strmLName);
			member4.setMemEmail(strmEmail);
			member4.setMemPhone(strmPhone);
			member4.setMemAddress1(strmAddress1);
			member4.setMemAddress2(strmAddress2);
			member4.setMemCity(strmCity);
			member4.setMemState(strmState);
			member4.setMemZipcode(strmZipcode);
			member4.setMemPrefnotfn(strmPrefnotfn);
			member4.setMemPrefpmt(strmPrefpmt);
			member4.setMemCreditcard(strmCreditcard);
			member4.setMemPrimeflag(strmPrimeflag);
			member4.setMemType(strmmemType);
			mops.addMembers(member4, members1);
			break;
		}
		default: {

			System.out.println("Invalid option");
			break;
		}

		}

	}

}
