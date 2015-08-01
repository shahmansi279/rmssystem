package com.project.rms.vehicle;


public class InfantSeat extends VehicleDecorator
{
	public InfantSeat(Vehicle vDec){
		super(vDec);
	}
	
	public void cost() {
		// TODO implement me	
	}
	
	public String getFeatureDescription() {
		// TODO implement me	
		return vDec.getFeatureDescription() + "+ Infant Car Seat";
	}
	
}