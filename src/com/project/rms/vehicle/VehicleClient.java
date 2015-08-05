package com.project.rms.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.rms.accounts.Member;

public class VehicleClient {
	public static Vehicle vehicle;
	public static String vId;
	public static  List<Vehicle> vehicles = new ArrayList<Vehicle>();
	static VehicleManager vm = new VehicleManager();
	
	public static void main(String[] args){
		
		Vehicle v1;
		//v1 = new Car("1","Toyota",2014,"1234567890",5,"Company Owned",Active,"Good");
	    //vehicles.add(v1);
		
		System.out.println("RMS Vehicle Management");
		System.out.println("------------------------");
		System.out.println("1. Manage Inventory");
		System.out.println("2. Choose a Vehicle");
		Scanner scanner2 = new Scanner ( System.in );
		int select = scanner2.nextInt ();
		
		if (select == 1){
			vehicle = new Car();
			System.out.println("RMS Vehicle Management");
			System.out.println("------------------------");
			System.out.println("1. Add Vehicle");
			System.out.println("2. Remove Vehicle");
			Scanner scanner3 = new Scanner ( System.in );
			int s = scanner3.nextInt ();
			if (s == 1){
				vehicle.setVehicleState(new VPending(vehicle));
				VPending vp = new VPending(vehicle);
				vp.doAction(vehicle);

			}
			else if (s == 2){
				System.out.println("Removing Vehicle... ");
				System.out.println("Enter Vehicle ID");
				Scanner scanner4 = new Scanner(System.in);
				vId = (scanner4.nextLine());
				vm.deleteVehicle(vId);
				System.out.println("Vehicle Removed");
				
			}
		}
		
		else if (select == 2){

		System.out.println("Select a vehicle type:");
		System.out.println("1. Car");
		Scanner scanner = new Scanner ( System.in );
		int vType = scanner.nextInt ();
		
		System.out.println("Select an additional feature:");
		System.out.println("1. Wheelchair Access");
		System.out.println("2. Infant Car Seat");
		System.out.println("3. Both");
		Scanner scanner1 = new Scanner ( System.in );
		int feature = scanner1.nextInt ();
		
		if ((vType == 1) && (feature == 1)){
			vehicle = new WheelChair(new Car());
			System.out.println(vehicle.getFeatureDescription());
		} 
		else if ((vType == 1) && (feature == 2)){
			vehicle = new InfantSeat(new Car());
			System.out.println(vehicle.getFeatureDescription());

		} 
		else if ((vType == 1) && (feature == 3)){
			vehicle = new WheelChair(new InfantSeat(new Car()));
			System.out.println(vehicle.getFeatureDescription()); 
			
			}
		}
	}
}
		

