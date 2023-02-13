// InterestApp Lab Week 3
// 10/2/23
// author Adam Plesca
import java.util.Scanner;

public class InterestApp{
	public static void main(String args[]){
		//declare variables
		double moneyGiven;
		int months;
		final double interest = 0.05;
		double moneyOwed;
		//scanner for user input
		Scanner keyboard;
	    keyboard = new Scanner(System.in);
		//tracks user input for amount given
		System.out.println("How much was lent to you?");
		moneyGiven = keyboard.nextDouble();
		//tracks user input for months given
		System.out.println("How many months did it take to repay it?");
		months = keyboard.nextInt();
		//process to get money owed
		moneyOwed = (moneyGiven * (months * interest)) + moneyGiven;
		//user gets notified / given info about final info
		System.out.println("The total that is owed is: $" + moneyOwed + " from the span of " + months + " months of interest added at 5%");
		System.out.println("The total interest added at 5% over " + months + " months was " + moneyGiven * (months * interest));
		}
}