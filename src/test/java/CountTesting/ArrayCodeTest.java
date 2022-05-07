package CountTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayCodeTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(10,5,30,25,50,42));
		
		Collections.sort(ar);
		
		System.out.println(ar);
		
		System.out.println(ar.get(1));
		

	}

}
