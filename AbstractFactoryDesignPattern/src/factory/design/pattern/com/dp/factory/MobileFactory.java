package factory.design.pattern.com.dp.factory;

import factory.design.pattern.com.dp.product.Iphone;
import factory.design.pattern.com.dp.product.RedMI;
import factory.design.pattern.com.dp.product.Samsung;

public class MobileFactory extends AbstractDeviceFactory{
 
	MobileFactory() {
 
	}
	
  public Device getDevice(String type)
  { 
    if ("Iphone".equals(type))
      return new Iphone("16 GB", "140 GB", "2,23 HGZ", true, true);
    else if ("RedMI".equals(type))
      return new RedMI("16 GB", "140 GB", "2,23 HGZ", true, true);
    else if ("Samsung".equals(type))
      return new Samsung("16 GB", "140 GB", "2,23 HGZ", true, true);
    else
    return null;
  }
}