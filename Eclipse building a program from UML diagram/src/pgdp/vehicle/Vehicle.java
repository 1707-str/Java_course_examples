package pgdp.vehicle;

public class Vehicle {
	private int seats;
	private int vehicleNumber;
	private String licensePlate;
	private double currentPosition;
	private Engine engine;
	private FuelTank fuelTank;

	public Vehicle(int seats, int vehicleNumber, String licensePlate, String model, double capacity,
			double fuelConsumption) {
		this.seats = seats;
		this.vehicleNumber = vehicleNumber;
		this.licensePlate = licensePlate;
		this.currentPosition = 0.0;
		this.engine = new Engine(model, capacity, fuelConsumption);
		this.fuelTank = new FuelTank();

	}

	public double getCurrentPosition() {
		return currentPosition;
	}

	public double fillUpTank(double amount) {
		return fuelTank.fillUp(amount);
	}

	public void drive(double fuelToUse) {
		fuelTank.letFuelOut(fuelToUse);
		double distance = engine.burnFuel(fuelToUse);
		currentPosition += distance;
	}

	public String toString() {
		return "Fahrzeug #" + vehicleNumber + " mit Kennzeichen " + licensePlate + " hat " + seats
				+ " Sitzplätze.\nTank: " + fuelTank.toString() + "\nMotor: " + engine.toString();
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle(2, 9001, "P1NGU", "Pingu V8 Turbo", 100.0, 42);
		System.out.println(v.toString());
	}

}
