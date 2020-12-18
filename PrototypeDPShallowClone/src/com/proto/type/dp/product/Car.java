package com.proto.type.dp.product;

import com.shallow.clone.designpattern.prototype.Vehicle;

public class Car extends Vehicle{
	
	String carType ;

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Override
	public String toString() {
		return "Car [getCarType()=" + getCarType() + ", getFuelType()=" + getFuelType() + ", getEngineType()="
				+ getEngineType() + ", isCar()=" + isCar() + ", getPassengerList()=" + getPassengerList() + "]";
	}
	
}
