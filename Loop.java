import java.util.*;
public class Loop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = -1;
		int sum = 0;
		while (num != 0) {
			num = input.nextInt();
			sum += num;
		}
		System.out.print(sum);
		input.close();
			
		}
	}
