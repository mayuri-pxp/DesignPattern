package factory.design.pattern.com.dp.factory;
public interface Device {
 
	public abstract String ram();
	public abstract String hdd();
	public abstract String cpu();
	
	public boolean isGraphicsEnabled();
	public boolean isBluetoothEnabled();
	
	public void getDeviceDetails();
}