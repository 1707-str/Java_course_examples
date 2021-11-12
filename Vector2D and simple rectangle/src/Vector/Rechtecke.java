package Vector;

public class Rechtecke {
	private Vector2D topLeft, bottomRight;

	public Rechtecke(Vector2D topLeft, Vector2D bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

	public double calculateArea() {
		Vector2D tl = this.topLeft;
		Vector2D br = this.bottomRight;
		double Breite = br.getX() - tl.getX();
		double Houhe = tl.getY() - br.getY();
		return Houhe * Breite;

	}

	public void schiftBy(Vector2D vector) {
		this.topLeft.add(vector);
		this.bottomRight.add(vector);
	}

	public String toString() {
		return "Rectangle spanned by points " + this.topLeft.toString() + " and " + this.bottomRight.toString()
				+ " And Area is: " + this.calculateArea();
	}

	public static void main(String[] args) {
		Vector2D a = new Vector2D(0.0, 1.0);
		Vector2D b = new Vector2D(2.0, 0.0);
		Rechtecke c = new Rechtecke(a, b);
		System.out.println(c.toString());

	}

}
