package com.project.rms.vehicle;


public class WheelChair extends VehicleDecorator
{
	public WheelChair(Vehicle vDec){
		super(vDec);
	}
	
	public void cost() {
		// TODO implement me	
	}
	
	public void getFeatureDescription() {
		// TODO implement me
		return vDec.getFeatureDescription() + "+ WheelChair Access";
	}
	
}
