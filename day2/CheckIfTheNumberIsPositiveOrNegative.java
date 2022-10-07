package week1.day2;

import java.util.Scanner;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Getting inputs from User
		System.out.println("Enter your number: ");
		int num=sc.nextInt();
		
		//Verifying the num is positive or negative and printing the same.
		if(num>0)
		{
			System.out.println("The Given num is Positive Number" +": "+ num);

		}
		else if(num<0) {
			System.out.println("The Given num is Negative Number" +": "+ num);
		}
		else
		{
			System.out.println("The Given num is neither Positive nor Negative" +": "+ num);
		}

	}
}
