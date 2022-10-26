package javaChallenge;

public class RepeatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {1,1,1,3,3,4,3,2,4,2};
		int count = 0;
		boolean flag = false;

		//System.out.println(num.length);
		for (int i : num) {
			// int temp=num[i];
			int sum = 0;

			for (int j = num[sum]; j < num.length;) {
				if (sum >= num.length) {
					if (count > 1) {
						flag = true;
					}
					break;
				}
				int temp1 = num[sum];

				if (i == temp1) {
					count++;
					sum++;
				} else
					sum++;
			}
			count = 0;
		}
		if (flag == true) {
			System.out.println("true");
		} else {
			System.out.println("The array has no repeating num");
		}
	}

}
