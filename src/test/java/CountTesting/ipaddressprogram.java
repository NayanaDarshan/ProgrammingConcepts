package CountTesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ipaddressprogram {

	public static void main(String[] args) {
		
		String str= "10.4.5.557367aaaaaa;89.78.97.748474dbgrrggr;10.764.56::66qawert";
		
		/*
		 * String newstr;
		 * 
		 * Pattern p = Pattern.compile("\\d+");
		 * 
		 * Matcher m = p.matcher(str);
		 * 
		 * while(m.find()) {
		 * 
		 * newstr=m.group();
		 * 
		 * System.out.println(newstr);
		 * 
		 * }
		 */
	
	     String newstr[] = str.split(";");
	     
	     for(String ip :newstr) {
	    	 
	    	// System.out.println(ip);
	    	 
	    	 System.out.println(ip.replaceAll("[a-zA-Z]", ""));
	     }
	}
	

}
