import java.util.*;
public class WolfProject {

	public static void main(String[] args) {

		//1 = villager
		//2 = wolf
		//3 = seer
		//-1 = out of the game

		//player identities of the game
		Integer[] players = {1,1,1,1,2,2,3};
		//create a seer list to keep the seer from checking the same person twice
		Integer[] seerList = new Integer[] {0,0,0,0,0,0,0};
		Collections.shuffle(Arrays.asList(players));
		System.out.println(Arrays.toString(players));


		int check;
		String[] result = {""};

		while (Arrays.asList(players).contains(1)&&Arrays.asList(players).contains(2)&&Arrays.asList(players).contains(3)) {
			check = nightFunction (players, seerList, result);

			if (players[check] != 2 && players[check] != -1) {
				dayFunction (players, check, result);
			}

		}

		printResults(players, result);

	}
	//performs all functions that happen in the night
	private static int nightFunction (Integer[] players, Integer[] seerList, String[] result) {
		int kill;
		int check;

		kill = -1;
		while (kill == -1) {
			kill = (int)(Math.random()*7);
			if (players[kill] == 2 || players[kill] == -1) {
				kill = -1;
			}
		}
		players[kill] = -1;
		result[0] = result[0] + "Player " + kill + " is killed\n";


		check = -1;
		while (check == -1) {
			check = (int)(Math.random()*7);
			if (seerList[check] == 1 || players[check] == 3 || players[check] == -1) {
				check = -1;
			}
		}
		seerList[check] = 1;
		if (players[check] == 2) {
			players[check] = -1;
			result[0] = result[0] + "Player " + check + " is verified by the seer as a wolf and he is out of the game\n";
		}
		return check;
	}
	//performs all functions that happen in the day
	private static void dayFunction (Integer[] players, int check, String[] result) {
		int vote = -1;

		while (vote == -1) {
			vote = (int)(Math.random()*7);
			if (players[vote] == -1 || vote == check) {
				vote = -1;
			}
		}
		players[vote] = -1;
		result[0] = result[0] + "Player " + check + " is verified by the seer as a villager, player " + vote + " is out of the game\n";
	}
	//prints results of each round and final result of game
	private static void printResults (Integer[] players, String[] result) {
		System.out.print(result[0]);
		if (!Arrays.asList(players).contains(3)) {
			System.out.println("Wolf wins.");
		}
		else if (!Arrays.asList(players).contains(1)) {
			System.out.println("Wolf wins.");
		}
		else {
			System.out.println("People wins.");
		}
	}
}
