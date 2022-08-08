import java.util.*;

public class Welcome {
	
	public static void main (String[] args) {
		//Celsius to Fahrenheit Converter
		Scanner input = new Scanner(System.in);
		double Celsius, Fahrenheit;
		System.out.print("Type a number: ");
		Celsius = input.nextDouble();
		Fahrenheit = (9.0/5)*Celsius + 32;
		System.out.println("Celsius: " + Celsius + " is " + "Fahrenheit: " + Fahrenheit);
		input.close();
	}
}
