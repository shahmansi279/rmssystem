package com.project.rms.vehicle;

public class InfantSeat extends VehicleDecorator
{
	public InfantSeat(Vehicle vDec){
		super(vDec);
	}
	
	public int cost() {
		// TODO implement me
		return 5;
	}
	
	public String getFeatureDescription() {
		// TODO implement me	
		return vDec.getFeatureDescription() + "+ Infant Car Seat";
	}
	
}