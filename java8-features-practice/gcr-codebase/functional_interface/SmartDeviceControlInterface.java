package functional_interface;
interface Device{
	void turnOn();
	void turnOff();
}
class Light implements Device{
	@Override
	public void turnOn() {
		System.out.println("Lights turned on");
	}
	@Override
	public void turnOff() {
		System.out.println("Lights turned off");
	}
}
class AC implements Device{
	@Override
	public void turnOn() {
		System.out.println("AC turned on");
	}
	@Override
	public void turnOff() {
		System.out.println("AC turned off");
	}
}
class TV implements Device{
	@Override
	public void turnOn() {
		System.out.println("TV turned on");
	}
	@Override
	public void turnOff() {
		System.out.println("TV turned off");
	}
}
public class SmartDeviceControlInterface {
	public static void main(String[] args) {
		Device light=new Light();
		Device ac=new AC();
		Device tv=new TV();
		light.turnOn();
		ac.turnOn();
		tv.turnOn();
		light.turnOff();
		ac.turnOff();
		tv.turnOff();
		
	}
}
