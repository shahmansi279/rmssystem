package com.project.rms.vehicle;

import java.util.Scanner;

public class VehicleClient {
	public static Vehicle vehicle;
	public static void main(String[] args){
		
		System.out.println("Select");
		System.out.println("1. Manage Inventory");
		System.out.println("2. Choose a Vehicle");
		Scanner scanner2 = new Scanner ( System.in );
		int select = scanner2.nextInt ();
		
		if (select == 1){
			//vehicle = new Vehicle();
			vehicle.addVehicle();
			vehicle.activeVehicle();
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
		

