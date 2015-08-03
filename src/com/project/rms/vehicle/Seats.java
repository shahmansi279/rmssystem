package com.project.rms.vehicle;


public class Seats extends VehicleDecorator
{
	public Seats(Vehicle vDec){
		super(vDec);
	}
	
	public int cost() {
		// TODO implement me
		return 5;
	}
	
	public String getFeatureDescription() {
		// TODO implement me
		return vDec.getFeatureDescription() + "+ 5 seats";
	}
	
}