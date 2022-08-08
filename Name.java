import java.util.*;

public class Name {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What's your first name: ");
		String firstName = input.next();
		System.out.println("What's your last name: ");
		String lastName = input.next();
		System.out.println(firstName + ", What's your lover's first name: ");
		String loverName = input.next();
		System.out.println(firstName + ", What's your lover's last name: ");
		String loverLastName = input.next();
		
		String fullName = firstName + " " + lastName;
		String marriageName = firstName + " " + loverLastName;
		String marriageHyphenName = fullName + "-" + loverLastName;
		int nameLength = firstName.length() + loverName.length();
		String initials = "" + firstName.charAt(0) + loverName.charAt(0);
		
		System.out.println("Your name when you get married can be " + marriageName + " or " + marriageHyphenName);
		//System.out.println("Your full name is " + nameLength + " letter long");
		//System.out.println("Your initials are " + initials);
		input.close();
		
	}
}