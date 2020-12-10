package factory.design.pattern.com.dp.factory;


public class  ProduceDevice {
  
  public static AbstractDeviceFactory getDeviceFactory(String gadgetType)
  {
    if ("Computer".equals(gadgetType))
      return new ComputerFactory();
    else
      return new MobileFactory();
    
  }
  
}
