package CountTesting;

public class stringTest {

	public static void main(String[] args) {
		
		String str= "Thiddddds is Nayana learning Nayana string";
		
		System.out.println(str.length());

		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('d'));
		
		System.out.println(str.indexOf('d', str.indexOf('d')+1));
		
		System.out.println(str.indexOf('d', (str.indexOf('d')+1)+1));
	
		System.out.println(str.indexOf("Nayana"));
		
		System.out.println(str.indexOf("Nayana", str.indexOf("Nayana")+1));
		
	     System.out.println(str.charAt(str.length()-1));
	     
	     String s1="Nayana";
	     
	     String s2= "Nayana";
	     
	     System.out.println(s1==s2);
	     
	     String s3= "Nayana Smira";
	     
	     System.out.println(s3.substring(3, 11));
	}
	

}
