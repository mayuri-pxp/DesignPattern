package factory.design.pattern.com.dp.factory;


public class  ProduceDevice {
  
  public static AbstractDeviceFactory produceDevice(String gadgetType)
  {
    if ("Computer".equals(gadgetType))
      return new ComputerFactory();
    else
      return new MobileFactory();
    
  }
  
}
