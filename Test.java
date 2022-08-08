import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Circle Radius: ");
		double radius = keyboard.nextDouble();
		keyboard.nextLine();

		Circle circle = new Circle(radius);

		System.out.print("New Circle Radius: ");
		radius = keyboard.nextDouble();
		keyboard.nextLine();

		circle.resetRadius(radius);

		System.out.println("Area: " + circle.calculateArea());

		keyboard.close();
	}
}