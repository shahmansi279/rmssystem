package com.project.rms.utils;

public class GPSHelper {
	
	
public	GPSLocation getGPSLocation(String address){
	
	GPSLocation gps= new GPSLocation();
	
	gps.setLatitude(getLatitude(address));
	gps.setLongitude(getLongitude(address));

	return gps;
	
	
}

private String getLongitude(String address) {
	
	String longitude = null;
	// TODO Auto-generated method stub
	return longitude;
}

private String getLatitude(String address) {
	String latitude = null;
	// TODO Auto-generated method stub
	return latitude;
}

}
