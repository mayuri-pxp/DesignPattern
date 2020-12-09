package factory.design.pattern.com.dp.factory;

import factory.design.pattern.com.dp.product.Laptop;
import factory.design.pattern.com.dp.product.PC;
import factory.design.pattern.com.dp.product.Server;

public class ComputerFactory {
 
	private ComputerFactory() {
 
	}
	
  public static Computer getComputer(String type)
  { 
    if ("Laptop".equals(type))
      return new Laptop("16 GB", "140 GB", "2,23 HGZ", true, true);
    else if ("PC".equals(type))
      return new PC("16 GB", "140 GB", "2,23 HGZ", true, true);
    else if ("Server".equals(type))
      return new Server("16 GB", "140 GB", "2,23 HGZ", true, true);
    else
    return null;
  }
}