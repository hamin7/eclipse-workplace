import java.util.Scanner;

public class Guess_the_Number {
	public static void main(String[] args) {
		int secretNumber;
		secretNumber = (int) (Math.random() * 999 + 1);
		Scanner keyboard = new Scanner(System.in);
		int guess;
		do {
			System.out.print("Enter a guess (1-1000): ");
			guess = keyboard.nextInt();
			
			switch(guess) {
			case 3: System.out.println("input number is " + guess); break;
			case 2: System.out.println("input number is " + guess); break;
			case 1: System.out.println("input number is " + guess); break;
			default:
				System.out.println("You input" + guess);
			}
		} while (guess != secretNumber);
	}

}
