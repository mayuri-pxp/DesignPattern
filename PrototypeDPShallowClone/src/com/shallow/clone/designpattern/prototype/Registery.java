package com.shallow.clone.designpattern.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.proto.type.dp.product.Bus;
import com.proto.type.dp.product.Car;
import com.proto.type.dp.product.VehicleType;

public class Registery {
	
	Map<VehicleType, Vehicle> vehMapMap = new HashMap<>();
	
	public Registery()
	{
		initialize();		
	}
	
	public Vehicle getVehicle(VehicleType type) {
		Vehicle vehicle = null;
		try {
			vehicle = (Vehicle) this.vehMapMap.get(type).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehicle;
	}
	
	//Can be a REST Call
	//Can be a DB Call
	public void initialize() {
		ArrayList<Integer> carPsg = new ArrayList<Integer>();
		ArrayList<Integer> busPsg = new ArrayList<Integer>();
		// Create Car
		Car car = new Car();
		car.setCarType("MINI");
		car.setEngineType("CarEngine");
		car.setFuelType("Diesel");
		car.setCar(true);
		for (int i = 1; i <= 5; i++) {
			carPsg.add(i);
		}
		car.getPassengerList().addAll(carPsg);
		vehMapMap.put(VehicleType.CAR, car);
		
		// Create Bus
		Bus bus = new Bus();
		bus.setNumberOfSeats(50);
		bus.setEngineType("busEngine");
		bus.setFuelType("Petrol");
		bus.setCar(false);
		for (int i = 1; i <= 6; i++) {
			busPsg.add(i);
		}
		bus.getPassengerList().addAll(busPsg);
		vehMapMap.put(VehicleType.BUS, bus);
	}
}
