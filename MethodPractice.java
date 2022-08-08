import java.util.Scanner;

class MethodPractice {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hey Ruqoo! What do you want me to say? ");
		String x = input.nextLine();
		System.out.println("How many times would you like me to say it? ");
		int times = input.nextInt();
		print(x, times);
	}
	
	public static void print(String s, int num) {
		for(int i = 1; i <= num; i++) {
			System.out.println(s);
		}
	}
}
