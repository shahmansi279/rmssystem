package com.project.rms;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.rms.accounts.*;
import com.project.rms.notification.TripNotification;
import com.project.rms.request.*;
import com.project.rms.service.PrivateTaxi;
import com.project.rms.service.ServiceClient;
import com.project.rms.service.SharedTaxi;
import com.project.rms.service.Uber;
import com.project.rms.service.YellowCab;
import com.project.rms.vehicle.*;

public class RMSClient {

	ArrayList<Vehicle> vArr;
	ArrayList<Request> reqArr;
	ArrayList<Member> customerArr;
	ArrayList<Member> driverArr;
	ArrayList<Member> adminArr;
	ArrayList<Trip> tripArr;
	RequestClient reqClient;
	TripManager tripClient;
	VehicleClient vehClient;
	AccountClient acctClient;
	ServiceClient scClient;

	RMSClient() {

		this.reqClient = new RequestClient();
		this.tripClient = new TripManager();
		this.scClient = new ServiceClient();
		this.vehClient = new VehicleClient();
		this.acctClient = new AccountClient();

	}

	public static void main(String args[]) {

		RMSClient rms = new RMSClient();
		// rms.populateData();
		rms.showMainMenu();

	}

	public void populateData() {

		populateAccountData();
		populateRequestData();
		populateVehicleData();

		// TODO Auto-generated method stub

	}

	public void populateVehicleData() {

		// jessie needs to poulate some vehicle data

		// TODO Auto-generated method stub

	}

	public void populateRequestData() {

		// TODO Auto-generated method stub

	}

	public void populateAccountData() {

		// thiagu needs to poulate some account data - some customer , some
		// sysadmin , some driver , some contractor

		// TODO Auto-generated method stub

	}

	private void showMainMenu() {

		System.out.println("Welcome to RMS System --- Please choose your role from the Menu below");
		System.out.println("1 Customer");
		System.out.println("2 RMS System Admin");

		System.out.println("3. Driver");

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

			System.out.println("Driver");
			showDriverMenu();

			break;

		default:
			System.out.println("Invalid Option .... Please Try Again");
			showMainMenu();
			break;
		}

		// selectSubMenu(choice);
		// TODO Auto-generated method stub

	}

	private void showDriverMenu() {

		System.out.println("Choose a valid option");

		System.out.println("1 Update Trip Status");
		System.out.println("2 Return to Main Menu");

		Scanner scan = new Scanner(System.in);
		int choice = Integer.parseInt(scan.nextLine());

		switch (choice) {
		case 1:

			System.out.println("Update Trip Status");
			// this.tripClient.setTripArr(this.tripArr);
			this.tripClient.processTripUpdateRequest();

			break;
		case 2:
			System.out.println("Return to Main Menu");
			showMainMenu();

			break;

		default:
			System.out.println("Invalid Option .... Please Try Again");
			showDriverMenu();
			break;
		}

	}

	private void showAdminMenu() {

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
			acctClient.processRequest();
			// invoke account client

			break;
		case 2:
			System.out.println("CRUD Rule");
			scClient.processRuleRequest();

			// invoke rule manager

			break;
		case 3:
			System.out.println("CRUD Vehicle");
			VehicleManager vm = new VehicleManager();
			vm.retrieveVehicle("SharedTaxi", "555 94087");
			// invoke vehicle manager
			// vehClient.createVehicle();

			break;
		case 4:

			// this.tripClient.setTripArr(this.tripArr);
			this.tripClient.processTripUpdateRequest();

			break;
		case 5:
			System.out.println("Update Payment");

			// invoke trip client

			break;

		case 6:
			System.out.println("Return to Main Menu");
			showMainMenu();
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

	private void showCustomerMenu() {

		// init()

		System.out.println("Choose a valid option");
		System.out.println("1 CRUD Account");

		System.out.println("2 Request Ride");

		System.out.println("3 Return to Main Menu");
		System.out.println("4 Exit");

		Scanner scan = new Scanner(System.in);
		int choice = Integer.parseInt(scan.nextLine());

		switch (choice) {
		case 1:
			System.out.println("Create an Account");

			acctClient.processRequest();

		case 2:
			System.out.println("Request Ride");
			this.reqClient.createRequest();

			break;

		case 3:
			System.out.println("Return to Main Menu");
			break;

		case 4:
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