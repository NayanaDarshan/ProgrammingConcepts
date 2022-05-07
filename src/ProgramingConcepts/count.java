package ProgramingConcepts;

public class count {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 3, 4, 0, 0, 0, 7, 10, 9, 10 };

		int arr2[] = new int[arr.length];

		for (int i = 0, j = 0; i < arr.length; i++) {

			if (arr[i] != 0) {

				arr2[j++] = arr[i];

			}

		}
		for (int n : arr2) {
			System.out.println(n);
		}

		System.out.println(reverseNum(567));
	}

	public static int reverseNum(int num) {

		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num= num/10;

		}
		return rev;
	}

}
