/*
Output when run:
Circle Radius: 12
New Circle Radius: 3
Area: 28.274333882308138
*/

public class Circle {

	public double radius;

	public double initialRadius() {
		return radius;
	}

	public void resetRadius(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	public Circle(double radius) {
		resetRadius(radius);
	}
}