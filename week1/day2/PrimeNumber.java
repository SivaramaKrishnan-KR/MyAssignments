package week1.day2;

import java.util.Iterator;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializing value
		int num=80;

		//Validating and printing the number is prime or not prime
		for (int i=2;i<num-1;i++)
		{
			if(num%i!=0)
			{
				System.out.println(num + " is a prime num");
				break;
			}
			else
			{
				System.out.println(num + " is not a prime num");
				break;
			}
		}
	}

}
