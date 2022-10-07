package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int sum = 0;
		int remainder;

		while(num>0)
		{
			//assigning remainder value
			remainder=num%10;

			//sum of digits
			sum= sum+remainder;

			num=num/10;
		}

		//printing the result
		if(sum>0) 
		{
			System.out.println("The sum of Digits: "+sum);
		}
		else
		{
			System.out.println("The given num is 0 or Negative num");
		}
	}
}


