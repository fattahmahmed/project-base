/* 		
		Money Gained in Strategy 1: 97 
 		Money Gained in Strategy 2: 89		
 		Most times when I ran the program, the first strategy would 
 		yield more money than the second strategy		
 */

public class RPS {
	public static void main(String[] args) {

		int moneyGained = 0;
		int count = 1;
		int cpuRock = 0;
		int cpuPaper = 0;
		int cpuScissors = 0;
		int userChoice2 = 0;
		int moneyGained2 = 0;
		int cpuWins = 0;
		int userWins = 0;
		int ties = 0;
		int cpuWins2 = 0;
		int userWins2 = 0;
		int ties2 = 0;

		while (count <= 100) {

			int userChoice = 0;
			int cpuChoice = 1 + (int)(Math.random() * 3);
			if (cpuChoice == 1) 
				cpuRock ++;
			else if (cpuChoice == 2) 
				cpuPaper ++;
			else
				cpuScissors ++;

			if (count % 3 == 1) { 
				userChoice = 1; //1 = Rock
			} else if (count % 3 == 2) { 
				userChoice = 2; //2 = Paper
			} else if (count % 3 == 0) {
				userChoice = 3; //3 = Scissors
			}	
			switch (userChoice) {
			case 1:
				if (cpuChoice == 1) {
					moneyGained += 1;
					ties ++;
				} else if (cpuChoice == 2) {
					moneyGained += 0;
					cpuWins ++;
				} else if (cpuChoice == 3) {
					moneyGained += 2;
					userWins ++; 
				} break;

			case 2:
				if (cpuChoice == 2) {
					moneyGained += 1;
					ties ++;
				} else if (cpuChoice == 3) {
					moneyGained += 0;
					cpuWins ++;
				} else if (cpuChoice == 1) {
					moneyGained += 2;
					userWins ++; 
				} break;

			case 3:
				if (cpuChoice == 3) {
					moneyGained += 1;
					ties ++;
				} else if (cpuChoice == 1) {
					moneyGained += 0;
					cpuWins ++;
				} else if (cpuChoice == 2) {
					moneyGained += 2;
					userWins ++; 
				} break;
			}

			//====== BEGIN most probability strategy

			int temp;
			if (cpuRock < cpuPaper) {
				if (cpuRock < cpuScissors) userChoice2 = 2;
				else if (cpuRock == cpuScissors) {
					temp = (int)(Math.random() * 2 );
					if (temp == 0) userChoice2 = 2;
					else userChoice2 = 1;
				}
			} 
			if (cpuPaper < cpuScissors) {
				if (cpuPaper < cpuRock) userChoice2 = 3;
				else if (cpuPaper == cpuRock) {
					temp = (int)(Math.random() * 2 );
					if (temp == 0) userChoice2 = 3;
					else userChoice2 = 2;
				}
			} 
			if (cpuScissors < cpuRock) {
				if (cpuScissors < cpuPaper) userChoice2 = 1;
				else if (cpuScissors == cpuPaper) {
					temp = (int)(Math.random() * 2 );
					if (temp == 0) userChoice2 = 1;
					else userChoice2 = 3;
				}
			} 
			switch (userChoice2) {
			case 1:
				if (cpuChoice == 1) {
					moneyGained2 += 1;
					ties2 ++;
				} else if (cpuChoice == 2) {
					moneyGained2 += 0;
					cpuWins2 ++;
				} else if (cpuChoice == 3) {
					moneyGained2 += 2;
					userWins2 ++; 
				} break;

			case 2:
				if (cpuChoice == 2) {
					moneyGained2 += 1;
					ties2 ++;
				} else if (cpuChoice == 3) {
					moneyGained2 += 0;
					cpuWins2 ++;
				} else if (cpuChoice == 1) {
					moneyGained2 += 2;
					userWins2 ++; 
				} break;

			case 3:
				if (cpuChoice == 3) {
					moneyGained2 += 1;
					ties2 ++;
				} else if (cpuChoice == 1) {
					moneyGained2 += 0;
					cpuWins2 ++;
				} else if (cpuChoice == 2) {
					moneyGained2 += 2;
					userWins2 ++; 
				} break;
			}
			//====== END most probability strategy
			count++;

		}


		System.out.println("Computer wins: " + cpuWins);
		System.out.println("User wins: " + userWins);
		System.out.println("Ties: " + ties);
		System.out.println("Money Gained: " + moneyGained + "\n");
		System.out.println("Computer wins 2: " + cpuWins2);
		System.out.println("User wins 2: " + userWins2);
		System.out.println("Ties 2: " + ties2);
		System.out.println("Money Gained 2: " + moneyGained2 + "\n");
		System.out.println("CPU Rock: " + cpuRock);
		System.out.println("CPU Paper: " + cpuPaper);
		System.out.println("CPU Scissors: " + cpuScissors);
	}
}
