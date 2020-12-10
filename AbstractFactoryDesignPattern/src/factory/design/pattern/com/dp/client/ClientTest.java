package factory.design.pattern.com.dp.client;

import factory.design.pattern.com.dp.factory.AbstractDeviceFactory;
import factory.design.pattern.com.dp.factory.Device;
import factory.design.pattern.com.dp.factory.ProduceDevice;

public class ClientTest {
 
	public static void main(String[] args) {
		
	  AbstractDeviceFactory computerFactory = ProduceDevice.getDeviceFactory("Computer");
	  AbstractDeviceFactory mobileFactory = ProduceDevice.getDeviceFactory("Mobile");
	  Device device = computerFactory.getDevice("Laptop");
	  device.getDeviceDetails();
	  
	  Device redmi = mobileFactory.getDevice("RedMI");
	  redmi.getDeviceDetails();
	  
	  Device phone = mobileFactory.getDevice("Iphone");
	  phone.getDeviceDetails();
	  
	  Device pc = computerFactory.getDevice("PC");
	  pc.getDeviceDetails();
	}
 
}