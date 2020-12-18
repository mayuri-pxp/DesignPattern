package com.shallow.clone.designpattern.prototype;

import com.proto.type.dp.product.Bus;
import com.proto.type.dp.product.Car;
import com.proto.type.dp.product.VehicleType;

public class ClientTest {
	
	public static void main(String[] args) {

		Registery registery = new Registery();
		
		/*
		 * Car orgcar = (Car) registery.getVehicle(VehicleType.CAR);
		 * System.out.println("ORIGIONAL CAR " + orgcar.toString());
		 * 
		 * Car clonedCar = (Car) registery.getVehicle(VehicleType.CAR);
		 * clonedCar.setCarType("LUXURY"); System.out.println("Clone CAR " +
		 * clonedCar.toString());
		 * 
		 * // Immutable System.out.println("ORIGIONAL CAR " +
		 * registery.getVehicle(VehicleType.CAR));
		 */
		

		
		  Bus orgbus = (Bus) registery.getVehicle(VehicleType.BUS);
		  System.out.println("ORIGIONAL BUS " + orgbus.toString());
		  
		  Bus cloneBus = (Bus) registery.getVehicle(VehicleType.BUS);
		  cloneBus.setNumberOfSeats(100);//immutable cloneBus.setCar(true);//immutable
		  cloneBus.getPassengerList().remove(4);//mutable
		  System.out.println("Clone BUS " + cloneBus.toString());
		  
		  //non Primitive getPassengerList changed due to shallow clone
		  System.out.println("ORIGIONAL BUS " + (Bus)
		  registery.getVehicle(VehicleType.BUS));
		 

	}

}
