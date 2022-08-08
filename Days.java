/*	SAMPLE RUNS:
	Enter a month of the year (January, February, etc.):
	Januar
	Try again. But this time, spell properly.
	
	Enter a month of the year (January, February, etc.):
	February
	Enter a year (1999, 2000, etc.)
	2012
	There are 29 in February, 2012
 */

import java.util.Scanner;

public class Days {
	
	public static void main(String[] args) {
		String month;
		int year, days = 0;
		Scanner input = new Scanner(System.in);
			
			System.out.println("Enter a month of the year (January, February, etc.):" );
			month = input.next();
			
			if (month.matches ("January|February|March|April|May|June|July|August|September|October|November|December")) {
				System.out.println("Enter a year (1999, 2000, etc.)");
				year = input.nextInt();
				if(month.matches ("January|March|May|July|August|October|December")) {
					days = 31;
				}
				else if (month.matches ("April|June|September|November")) {
					days = 30;
				}
				else if (month.equals ("February")) {
					if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 100 != 0) {
						days = 29;
					}
					else days = 28;
				}
				
				//Print Statements
				System.out.println("There are " + days + " in " + month + ", " + year);
			}
			else System.out.println("Try again. But this time, spell properly.");
		}
	}