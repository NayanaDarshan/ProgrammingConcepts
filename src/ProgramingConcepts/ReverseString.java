package ProgramingConcepts;

public class ReverseString {

	//String s = "Nayana";
	
	public static void main(String[] args) {
		

	String revString =reverseString("Smira");
		
		System.out.println("The reveresed string is : "+revString);
		
	}
	
	public static String reverseString( String s) {
		
	String rev="";
		
		int length = s.length();
		
		for (int i=length-1; i>=0; i--) {
			
			rev= rev+s.charAt(i);
			
		}
		
		return rev;
	}
	
}
