package com.project.rms.vehicle;


public class WheelChair extends VehicleDecorator
{
	public WheelChair(Vehicle vDec){
		super(vDec);
	}
	
	public double cost() {
		// TODO implement me
		return vDec.cost()+ 2;
	}
	
	public String getFeatureDescription() {
		// TODO implement me
		return vDec.getFeatureDescription() + "+ WheelChair Access";
	}
	
}
