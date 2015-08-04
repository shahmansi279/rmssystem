package com.project.rms.vehicle;

public abstract class VehicleDecorator extends Vehicle
{
	protected Vehicle vDec;
	
	public VehicleDecorator(Vehicle vDec){
		this.vDec = vDec;
	}
	
	public String getFeatureDescription() {
		return vDec.getFeatureDescription();
	}
	
}