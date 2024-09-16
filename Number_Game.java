import java.util.Random;
import java.util.Scanner;

public class Number_game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int score =0;
		System.out.println("Welcome to the Number Game!!");
		System.out.print("Do you want to play Number Game: ");
		String playagain = input.nextLine();
		while(playagain.equalsIgnoreCase("yes")) {
			System.out.println("Game will be started!!");
		
		int target=random.nextInt(100)+1;
		int maxattempts=10;
		int attempts=0;
		while(attempts<maxattempts) {
			System.out.print("Enter your guess number(1-100): ");
			int user = input.nextInt();
			attempts++;
			if(user==target) {
				System.out.println("Congratulation! you gussed correct number.");
				score++;
				break;
			}
			if(user<target) {
				System.out.println("You gussed number too low.");
			}
			if(user>target) {
				System.out.println("You gussed number too high.");
			}
			if(attempts==maxattempts) {
				System.out.println("Sorry,you can run out of attempts");
			}
		}
		
		System.out.println("Your target number is: "+target);
		System.out.println("Your scored is: "+ score);
		break;
	}
		
		
	}

}