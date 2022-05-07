package CountTesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		
		String str= "The transaction id is 78909676";
		
		Pattern p = Pattern.compile("\\d+");
		
		Matcher m = p.matcher(str);
	
		while(m.find()) {
			System.out.println(m.group());
		}
	
	
	String str1= "The transaction id is 78909676";
	
	Pattern p1= Pattern.compile("[a-zA-Z]");
	
	Matcher m1= p1.matcher(str1);
	
	while(m1.find()) {
		System.out.println(m1.group().toString());
		
		String sm= m1.group().toString();
		
		String rev="";
		for( int i=0; i<sm.length(); i++) {
			
			rev= rev+ i;
			
		}
	                 
	}
	
	

	

}
}