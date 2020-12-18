package com.proto.type.dp.product;

import com.shallow.clone.designpattern.prototype.Vehicle;

public class Bus extends Vehicle {
	
	int numberOfSeats;

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Bus [getNumberOfSeats()=" + getNumberOfSeats() + ", getFuelType()=" + getFuelType()
				+ ", getEngineType()=" + getEngineType() + ", isCar()=" + isCar() + ", getPassengerList()="
				+ getPassengerList() + "]";
	}
	
}
