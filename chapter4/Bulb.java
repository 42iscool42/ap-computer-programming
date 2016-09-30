package chapter4;

public class Bulb {
	private boolean isOn;
	
	public Bulb() {
		isOn = false;
	}
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public String state() {
		return isOn ? "On" : "Off";
	}
}
