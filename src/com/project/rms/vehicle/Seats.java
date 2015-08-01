package com.project.rms.vehicle;


public class Seats extends VehicleDecorator
{
	public Seats(Vehicle vDec){
		super(vDec);
	}
	
	public void cost() {
		// TODO implement me	
	}
	
	public String getFeatureDescription() {
		// TODO implement me
		return vDec.getFeatureDescription() + "+ 5 seats";
	}
	
}