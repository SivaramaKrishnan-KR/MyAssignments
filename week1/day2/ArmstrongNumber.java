package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int remainder;
		int sum=0;
		int compareValue=num;
		
		//Validating the given num is armstrong num
		while(num>0) {

			remainder=num%10;
			num=num/10;
			sum=sum+remainder*remainder*remainder;
		}
		
		//comparing and printing the results
		if(sum==compareValue)
			System.out.println(sum +" is an Armstrong Number");
		else
			System.out.println(compareValue +" is not an Armstrong Number");
	}
}


