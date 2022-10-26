package week3.day2;

public class MyBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC hdfc=new HDFC();
		System.out.println("Class HDFC values");
		hdfc.minimumBalance(5000);
		hdfc.provideDebitCard(true);
		hdfc.provideCreditCard(true);
		
		RBI rbi=new HDFC();
		System.out.println("interface RBI values");
		rbi.minimumBalance(6000);
		rbi.provideDebitCard(false);
	}

}
