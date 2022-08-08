import java.util.Scanner;

public class Exclude3 {
	
	public static void main (String[] args) {
		
		int sum = 0;
		int count = 1;
		while (count < 101) {
			if (count % 3 == 0) {
				count++;
				continue;
			}
			sum += count;
			count++;
		}
		System.out.print(sum);
	}
}
