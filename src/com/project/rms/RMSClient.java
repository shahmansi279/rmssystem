package com.project.rms;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.rms.accounts.*;
import com.project.rms.request.*;
//import com.project.rms.vehicle.*;

public class RMSClient {

//	Arraylist<Vehicle> vArr;
	ArrayList<Request> reqArr;
	ArrayList<Member> customerArr;
	ArrayList<Member> driverArr;
	ArrayList<Member> adminArr;
	static RequestClient reqClient;
	
	RMSClient(){
		
	

		
	}

	public static void main(String args[]) {
		
		reqClient= new RequestClient();
		populateData();
		showMainMenu();
		
	}

	private static void populateData() {

		populateAccountData();
		populateRequestData();
		populateVehicleData();

		// TODO Auto-generated method stub

	}

	private static void populateVehicleData() {

		// jessie needs to poulate some vehicle data

		// TODO Auto-generated method stub

	}

	private static void populateRequestData() {

		// mansi needs to poulate some request data

		// TODO Auto-generated method stub

	}

	private static void populateAccountData() {

		// thiagu needs to poulate some account data - some customer , some
		// sysadmin , some driver , some contractor

		// TODO Auto-generated method stub

	}

	private static void showMainMenu() {
		
		
		System.out.println("Welcome to RMS System --- Please choose your role from the Menu below");
		System.out.println("1 Customer");
		System.out.println("2 RMS System Admin");
		System.out.println("3 Contractor");
		System.out.println("4 Driver");
		
		Scanner scan = new Scanner(System.in);
		int choice = Integer.parseInt(scan.nextLine());
		
		
		switch (choice) {
		case 1:
			System.out.println("Customer ");
			showCustomerMenu();
			
			break;
		case 2:
			System.out.println("RMS System Admin");
			showAdminMenu();
			
			break;
		case 3:
			System.out.println("Contractor");
			showContractorMenu();

			break;
		case 4:

			System.out.println("Driver");
			showDriverMenu();
			
			break;

		default:
			System.out.println("Invalid Option .... Please Try Again");
			showMainMenu();
			break;
		}

		//selectSubMenu(choice);
		// TODO Auto-generated method stub

	}

	

	private static void showDriverMenu() {
		
		System.out.println("Choose a valid option");
		System.out.println("1 View Notification");
		System.out.println("2 View Account History");
		System.out.println("3 Update Trip Status");
		System.out.println("4 Return to Main Menu");

		Scanner scan = new Scanner(System.in);
		int choice = Integer.parseInt(scan.nextLine());
		
		switch (choice) {
		case 1:
			System.out.println("View Notification");
			//perform operations
			
			break;
		case 2:
			System.out.println("View Account History");
			//perform operations
			
			break;
		case 3:
			System.out.println("Update Trip Status");
			//perform operations
			
			break;
		case 4:
			System.out.println("Return to Main Menu");
			showMainMenu();
			
			break;
		case 5:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid Option .... Please Try Again");
			showDriverMenu();
			break;
		}

		
	}

	private static void showAdminMenu() {
		
		
		System.out.println("Choose a valid option");
		System.out.println("1 CRUD Account");
		System.out.println("2 CRUD Rule");
		System.out.println("3 CRUD Vehicle");
		System.out.println("4 Update Ride");
		System.out.println("5 Update Payment");
		System.out.println("6 Return to Main Menu");
		System.out.println("7 Exit");
		
		
		Scanner scan = new Scanner(System.in);
		int choice = Integer.parseInt(scan.nextLine());
		
		switch (choice) {
		case 1:
			System.out.println("CRUD Account");
			
			//invoke account client
			
			break;
		case 2:
			System.out.println("CRUD Rule");
			
			//invoke rule manager
			
			break;
		case 3:
			System.out.println("CRUD Vehicle");
			
			//invoke vehicle manager
			
			break;
		case 4:
			System.out.println("Update Trip");
			
			//invoke trip
			
			break;
		case 5:
			System.out.println("Update Payment");
			
			//invoke trip client
			
			break;
	
		case 6:
			System.out.println("Return to Main Menu");
			break;
		case 7:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid Option .... Please Try Again");
			showAdminMenu();
			break;

		}

		
	}
	// TODO Auto-generated method stub

	private static void showCustomerMenu() {
		
		//init()
		
		System.out.println("Choose a valid option");
		System.out.println("1 Create an Account");
		System.out.println("2 Update an Account");
		System.out.println("3 Delete an Account");
		System.out.println("4 Request Ride");
		System.out.println("5 Make Payment");
		System.out.println("6 Return to Main Menu");
		System.out.println("7 Exit");
		
		Scanner scan = new Scanner(System.in);
		int choice = Integer.parseInt(scan.nextLine());
		

		switch (choice) {
		case 1:
			System.out.println("Create an Account");
			
			
			
			//call to fucn
			
			break;
		case 2:
			System.out.println("Update an Account");
			
			//call to funcn
			break;
		case 3:
			System.out.println("Delete an Account");
			break;
		
		case 4:
			System.out.println("Request Ride");
			reqClient.createRequest();
			
			break;
		
		case 5:
			System.out.println("Make Payment");
			break;
		
		case 6:
			System.out.println("Return to Main Menu");
			break;
		
		case 7:
			System.out.println("Exit");
			break;
	
		default:
			System.out.println("Invalid Option .... Please Try Again");
			showCustomerMenu();
			break;
		}

		
		// TODO Auto-generated method stub

	}

	private static void showContractorMenu() {

		System.out.println("Choose a valid option");
		System.out.println("1 Create Contractor Account");
		System.out.println("2 Update Contractor Account");
		System.out.println("3 Delete Contractor Account");
		System.out.println("4 View Account History");
		System.out.println("5 Update Trip Status");
		System.out.println("6 View Notification");
		System.out.println("7 Return to Main Menu");
		System.out.println("8 Exit");
		
		Scanner scan = new Scanner(System.in);
		int choice = Integer.parseInt(scan.nextLine());
		

		switch (choice) {

		case 1:
			System.out.println("Create Contractor Account");
			break;
		case 2:
			System.out.println("Update Contractor Account");
			break;
		case 3:
			System.out.println("Delete Contractor Account");
			break;
		case 4:
			System.out.println("View Account History");
			break;
		case 5:
			System.out.println("Update Trip Status");
			break;
		case 6:
			System.out.println("View Notification");
			break;
		case 7:
			System.out.println("Return to Main Menu");
			break;
		case 8:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid Option .... Please Try Again");
			showContractorMenu();
			break;
		}

		
	}

	
}