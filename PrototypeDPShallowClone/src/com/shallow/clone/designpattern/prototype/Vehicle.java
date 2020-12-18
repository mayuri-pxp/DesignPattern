package com.shallow.clone.designpattern.prototype;

import java.util.ArrayList;

public abstract class Vehicle  implements Cloneable {
	
	private String fuelType ;
	private String engineType ;
	private boolean isCar;
	private ArrayList<Integer> passengerList = new ArrayList<Integer>();
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
		
	public boolean isCar() {
		return isCar;
	}
	public void setCar(boolean isCar) {
		this.isCar = isCar;
	}	
	public ArrayList<Integer> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(ArrayList<Integer> passengerList) {
		this.passengerList = passengerList;
	}
	//This is must to support Clone feature 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
