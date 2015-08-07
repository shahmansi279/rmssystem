package com.project.rms.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager
{
	Vehicle veh;
	ArrayList<Vehicle> vArr;
	public VehicleManager(){
		veh = new Car();
		this.vArr = new ArrayList<Vehicle>();
		//super();
		
		initVehicleData();
	}

	public ArrayList<Vehicle> getvArr() {
		return vArr;
	}



	public void setvArr(ArrayList<Vehicle> vArr) {
		this.vArr = vArr;
	}

	public void initVehicleData() {

		Vehicle v1 = new Car();
		v1.setvId("V0001");
		v1.setvModel("Toyota");
		v1.setvYear("2014");
		v1.setvIn("1234567890");
		v1.setVehicleType(1);
		v1.setvHealth(1);
		v1.setvDriver("D0001");
		v1.setLocation("655 E EL Camino Real Sunnyvale CA 94087");
		//v1.setMiles(50000);
		this.vArr.add(v1);
		
		
		
		Vehicle v2 = new Car();
		v2.setvId("V0002");
		v2.setvModel("Lexus");
		v2.setvYear("2013");
		v2.setvIn("3245642176");
		v2.setVehicleType(1);
		v2.setvHealth(1);
		v2.setvDriver("D0003");
		v2.setLocation("655 E EL Camino Real Sunnyvale CA 94087");
		//v1.setMiles(50000);
		this.vArr.add(v2);

		
		
		Vehicle v3 = new Car();
		v3.setvId("V0003");
		v3.setvModel("Honda");
		v3.setvYear("2013");
		v3.setvIn("7295642138");
		v3.setVehicleType(2);
		v3.setvHealth(1);
		v3.setvDriver(null);
		v3.setLocation("655 E EL Camino Real Sunnyvale CA 94087");
		//v1.setMiles(50000);
		this.vArr.add(v3);
		
		//System.out.println("Vehicle list - "+this.getvArr());


	}

	public Vehicle addVehicle(String vModel,String vYear,String vIn,int vType,int vHealth,String vDriver,String location) {
		
		
		Vehicle veh = new Car();
		int vIdSize = this.vArr.size();
		String vId = "V000" + (vIdSize + 1);
		veh.setvId(vId);
		veh.setvModel(vModel);
		veh.setvYear(vYear);
		veh.setvIn(vIn);
		veh.setVehicleType(vType);
		veh.setvHealth(vHealth);
		veh.setvDriver(vDriver);
		veh.setLocation(location);
		System.out.println("Vehicle added - Vehicle ID:" + veh.getvId()+" Vehicle Driver ID:" + veh.getvDriver());
		//add to array
		this.vArr.add(veh);
		return veh;
		
		
	}
	
	public Vehicle retrieveVehicle(String vehicleType) {
		// TODO implement me
		for (Vehicle v : this.vArr) {

			System.out.println("Vehicle " +v);
			int x = v.getVehicleType();
			if ((x == 1)&&(vehicleType.equals("PrivateTaxi"))){
				if((v.getLocation().contains("94087"))&&(v.getVehicleState().equals("VActive"))){
					System.out.println("Retrieving Vehicle details" + v.getvId());
					return v;
					/*VAssigned va = new VAssigned();
					v.setVehicleState(new VAssigned());
					va.doAction(v);*/
				}

			}
			else if ((x == 2)&&(vehicleType.equals("SharedTaxi"))){
				if((v.getLocation().contains("94087"))&&(v.getVehicleState().equals("VActive"))){
					System.out.println("Retrieving Vehicle details" + v.getvId());
					return v;
					/*VAssigned va = new VAssigned();
					v.setVehicleState(new VAssigned());
					va.doAction(v);*/
				}

			}

			}

			return null;
	}
	
	public void deleteVehicle(String vId) {
		// TODO implement me	
	        
		for (Vehicle v : this.vArr) {

			System.out.println("Vehicle " +v);
			if (v.getvId().equals(vId)){
				this.vArr.remove(v);
				System.out.println("Vehicle of ID "+vId+" has been removed");
			}
		}
		
        
 }
	

	
	public void updateVehicle() {
		// TODO implement me	
	}
	
}

