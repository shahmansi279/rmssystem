package com.project.rms.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleClient {
	public static Vehicle vehicle = new Car();
	public static String vId;
	public static  List<Vehicle> vehicles = new ArrayList<Vehicle>();
	static VehicleManager vm = new VehicleManager();
	
	public static void main(String[] args){
		

		System.out.println("RMS Vehicle Management");
		System.out.println("------------------------");
		System.out.println("1. CRUD Vehicle");
		System.out.println("2. Choose a Vehicle");
		Scanner scanner2 = new Scanner ( System.in );
		int select = scanner2.nextInt ();
		
		if (select == 1){
			System.out.println("RMS Vehicle Management");
			System.out.println("------------------------");
			System.out.println("1. Add Vehicle");
			System.out.println("2. Remove Vehicle");
			Scanner scanner3 = new Scanner ( System.in );
			int s = scanner3.nextInt ();
			if (s == 1){
				
				Scanner sc = new Scanner(System.in);
				System.out.println("\nPlease enter Vehicle ID ");
				String vId = sc.nextLine();
				System.out.println("\nPlease enter Vehicle Model");
				String vModel = sc.nextLine();
				System.out.println("\nPlease enter Vehicle Year");
				String vYear = sc.nextLine();
				System.out.println("\nPlease enter Vehicle Identification Number(VIN)");
				String vIn = sc.nextLine();
				System.out.println("\nPlease choose a Vehicle Type");
				System.out.println("1. Contractor Owned");
				System.out.println("2. Company Owned");
				int vType = sc.nextInt();
				//if (vType == 1){
				System.out.println("\nPlease enter name of the driver");
				String vDriver = sc.nextLine();

				//}else {String vDriver = null;}				
				System.out.println("\nIs vehicle health good or bad");
				System.out.println("1. Good");
				System.out.println("2. Bad");
				int vHealth = sc.nextInt();
				
				Vehicle v = vm.addVehicle(vId,vModel,vYear,vIn,vType,vHealth,vDriver);
				vehicle.setVehicleState(new VPending());
				VPending vp = new VPending();
				vp.doAction(v);

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
		

