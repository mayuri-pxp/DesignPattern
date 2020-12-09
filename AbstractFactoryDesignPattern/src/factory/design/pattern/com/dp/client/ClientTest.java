package factory.design.pattern.com.dp.client;

import factory.design.pattern.com.dp.factory.AbstractDeviceFactory;
import factory.design.pattern.com.dp.factory.ProduceDevice;

public class ClientTest {
 
	public static void main(String[] args) {
		
	  AbstractDeviceFactory device = ProduceDevice.produceDevice("Computer");
	  device.getDevice("Laptop").getDeviceDetails();
	}
 
}