import java.util.Scanner;

public class CodeForHer {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What's Your Name: ");
		String firstName = input.next();
		System.out.println(firstName + ", Enter your last name: ");
		String lastName = input.next();
		
		String fullName = firstName + " " + lastName ;
		int nameLength = firstName.length() + lastName.length();
		String initials = "" + firstName.charAt(0) + lastName.charAt(0);
		
		System.out.println("Welcome " + fullName);
		System.out.println("Your full name is " + nameLength + " letter long");
		System.out.println("Your initials are " + initials);
		input.close();
		
	}
}