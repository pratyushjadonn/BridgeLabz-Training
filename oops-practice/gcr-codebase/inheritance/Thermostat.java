package Inheritance;

public class Thermostat extends Device {
  String temperatureSetting;
  
  Thermostat(int deviceId,String status,String temperatureSetting){
	  super(deviceId,status);
	  this.temperatureSetting=temperatureSetting;
	  
  }
  public void display() {
		 System.out.println(deviceId + " " + status + " " + temperatureSetting);
	  }
}
