package com.project.rms.vehicle;


public class WheelChair extends VehicleDecorator
{
	public WheelChair(Vehicle vDec){
		super(vDec);
	}
	
	public int cost() {
		// TODO implement me
		return 5;
	}
	
	public String getFeatureDescription() {
		// TODO implement me
		return vDec.getFeatureDescription() + "+ WheelChair Access";
	}
	
}
