package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 3, 5, 8, 9, 6 };
		int[] array2 = { 1, 3, 8, 9, 6 };

		for (int i = 0; i < array1.length; i++) {
			int temp1 = array1[i];
			// System.out.println(temp);

			for (int j = i; j < array2.length;) {
				int temp2 = array2[j];

				if (temp1 == temp2) {
					System.out.println(temp1);
				}
				break;
			}
		}
	}
}