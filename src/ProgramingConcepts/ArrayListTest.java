package ProgramingConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayListTest {

	public static void main(String[] args) {
		
		getHashMapdata();
		
		getKeydata();

		ArrayList<String> months = new ArrayList<String>(
				Arrays.asList("January", "February", "March", "April", "May", "June", "July"));

		System.out.println("Before sorting----");

		months.stream().forEach(ele -> System.out.println(ele));

		Collections.sort(months);

		System.out.println("After sorting");

		for (int i = 0; i < months.size(); i++) {

			System.out.println("The month names are===>" + months.get(i));

			String monthnames = months.get(i);

			if (monthnames.length() > 3) {
				System.out.println("The last 3 characters is ===>" + months.get(i).substring(months.size() - 3));
			}

			else {
				System.out.println(months.get(i));
			}

		}

	}

	public static void getHashMapdata() {

		HashMap<String, String> hmap = new HashMap<String, String>();

		hmap.put("month1", "Jan");

		hmap.put("month2", "Feb");
		hmap.put("month3", "March");
		hmap.put("month4", "April");

		
		hmap.forEach((k,v) -> System.out.println("Key is ===>" +k +" and value is ===>"+v));
		
		for (Map.Entry<String, String> monthsname : hmap.entrySet()) {

			System.out.println("Key is===> " + monthsname.getKey() + "Value is====>" + monthsname.getValue());
			
		}

	}

	
	public static void getKeydata() {
		
		HashMap<String, String> hmap = new HashMap<String, String>();

		hmap.put("month1", "Jan");

		hmap.put("month2", "Feb");
		hmap.put("month3", "March");
		hmap.put("month4", "April");

		for(String monthdata : hmap.keySet()) {
			System.out.println(monthdata);
		}
		
		
		for(String monthnames : hmap.values()) {
			System.out.println(monthnames);
		}
		
	}
}
