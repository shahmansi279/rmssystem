package com.project.rms.vehicle;


public abstract class VehicleDecorator extends Vehicle
{
	protected Vehicle vDec;
	
	public VehicleDecorator(Vehicle vDec){
		this.vDec = vDec;
	}
	
	public abstract Sting getFeatureDescription() {
		return vDec.getFeatureDescription();
	}
	
}