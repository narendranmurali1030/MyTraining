package day15;

public class LearnPolymorphism {

	public void brake(Car car) {

		car.brake();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Polymorphic method call

		AudiCar ac = new AudiCar();
		BMWCar bc = new BMWCar();
		TaxiCar tc = new TaxiCar();
		DefaultCar dc = new DefaultCar();

		LearnPolymorphism learnPoly = new LearnPolymorphism();
		learnPoly.brake(ac);
		learnPoly.brake(bc);
		learnPoly.brake(tc);
		learnPoly.brake(dc);

		// Polymorhic Collection

		Car[] car = { new DefaultCar(), new AudiCar(), new BMWCar(), new TaxiCar() };
		for (Car each : car) {
			each.brake();
		}

	}

}
