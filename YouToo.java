import java.util.Scanner;

class YouToo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What do you want to say?");
		String x = input.nextLine();
		System.out.println("How many times do you wanna say it?");
		int times = input.nextInt();
		print(x, times);
	}
	
	public static void print(String s, int num) {
		for(int i = 1; i <= num; i++) {
			System.out.println(s);
		}
	}
}