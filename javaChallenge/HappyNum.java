package javaChallenge;

public class HappyNum {

	public static void main(String[] args) {

		int num = 19;
		int sum = 0;
		int rem;

		while (num > 9) {
			while (num > 0) {
				rem = num % 10;
				sum = sum + (rem * rem);
				num = num / 10;
			}
			if (num == 0) {
				num = sum;
				sum = 0;
			}
		}
		if (num == 1) {
			System.out.println("Happy num");
		} else {
			System.out.println("not a happy num");
		}
	}
}
