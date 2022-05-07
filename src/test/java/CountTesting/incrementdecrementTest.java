package CountTesting;

import java.util.Scanner;

public class incrementdecrementTest {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the name");
		
		int m=scn.nextInt();
		//int m=10;
		int n =m++;
				
				System.out.println(n);
				System.out.println(m);
		
	}

}
