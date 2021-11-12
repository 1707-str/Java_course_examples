package Vector;

public class Vector2D {
	private double x, y;

	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void add(Vector2D other) {
		this.x += other.x;
		this.y += other.y;

	}

	public String toString() {
		return "[" + this.x + ", " + this.y + "]";
	}

	public static void main(String[] args) {
		Vector2D a = new Vector2D(4.0, 5.0);
		System.out.println(a.toString());

	}

}
