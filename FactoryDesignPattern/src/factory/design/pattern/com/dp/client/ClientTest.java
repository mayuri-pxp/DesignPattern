package factory.design.pattern.com.dp.client;

import factory.design.pattern.com.dp.factory.Computer;
import factory.design.pattern.com.dp.factory.ComputerFactory;
import factory.design.pattern.com.dp.product.Laptop;

public class ClientTest {
 
	public static void main(String[] args) throws Exception {
		
	   //Tight coupling bad practice
	   Computer lappy = new Laptop("16 GB", "140 GB", "2,23 HGZ", true, true);
	   System.out.println("Lappy Config::"+lappy.toString());
	   
		//Client calls ComputerFactory to Create Computer with different configurations
	   Computer pc = ComputerFactory.getComputer("PC");
		System.out.println("PC Config::"+pc);
		
		Computer server = ComputerFactory.getComputer("Server");
		System.out.println("Server Config::"+server);
		
		Computer laptop = ComputerFactory.getComputer("Laptop");
		System.out.println("Laptop Config::"+laptop);
		
		//Computer test = ComputerFactory.getComputer("test");
	}
 
}