package pgdp.vehicle;

public class Engine {
	private String model;
	private double capacity;
	private double fuelConsumption;

	public Engine(String model, double capacity, double fuelConsumption) {
		this.model = model;
		this.capacity = capacity;
		this.fuelConsumption = fuelConsumption;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public double burnFuel(double amount) {
		return amount * fuelConsumption / 2;
	}

	public String toString() {
		return "Motor des Models " + model + " hat eine Kapazität von " + capacity + " und verbraucht "
				+ fuelConsumption + " Einheiten.";
	}

}
