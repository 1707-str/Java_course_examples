package pgdp.vehicle;

public class FuelTank {
	private double fillLevel = 0.0;

	public double getFillLevel() {
		return fillLevel;
	}

	public double fillUp(double amount) {
		this.fillLevel += amount;
		return this.fillLevel;
	}

	public double letFuelOut(double amount) {
		this.fillLevel -= amount;
		return this.fillLevel;
	}

	public String toString() {
		return "Der Füllstand beträgt " + fillLevel + " Einheiten.";
	}

}
