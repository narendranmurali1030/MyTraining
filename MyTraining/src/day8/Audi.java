package day8;

public class Audi {

	private int speed = 100;
	private boolean engineOn = false;
	private String carBrand = "Audi";
	
	public String hello ="hello";

	public int getSpeed() {
		hello="";
		return speed;
	}

	public void setSpeed(int speed) {
		// this refers to current object
		this.speed = speed;
	}

	public boolean isEngineOn() {
		return engineOn;
	}

	public void setEngineOn(boolean engineOn) {
		this.engineOn = engineOn;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public void accelerate(int speed) {
		this.speed = speed;

	}

	public static void main(String[] args) {

		Audi audiCar = new Audi();
		System.out.println(audiCar.speed);
		;
	}

}
