package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3,2,11,4,6,7,34,53,23};

		//sorting the values
		Arrays.sort(num);
		
		//Printing the second largest num
		System.out.println("The second largest array value is: "+ num[num.length-2]);

	}

}
