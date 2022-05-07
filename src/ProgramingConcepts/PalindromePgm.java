package ProgramingConcepts;

public class PalindromePgm {

	public static void main(String[] args) {
		
		isPalindrome(123);
		
}
	
	public static void isPalindrome(int num) {
  
		System.out.println("The given number is "+num);
		
		int r;
		
		int sum=0;
		
		int t =num;
		
		System.out.println(t);
		
		
		while(num>0) {
			
			r= num%10;
			
			sum= (sum*10)+r;
			
			num = num/10;
		}
		

	if(t==sum) {
		System.out.println("The given number is  palindrome");
	}
	else {
		System.out.println("The number is NOT a palindrome");
	}
	}
}
