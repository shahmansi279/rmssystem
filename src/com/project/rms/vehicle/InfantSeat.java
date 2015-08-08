package com.project.rms.vehicle;

public class InfantSeat extends VehicleDecorator
{
	public InfantSeat(Vehicle vDec){
		super(vDec);
	}
	
	public double cost() {
		// TODO implement me
		return vDec.cost()+1;
	}
	
	public String getFeatureDescription() {
		// TODO implement me	
		return vDec.getFeatureDescription() + "+ Infant Car Seat";
	}
	
}