package ProgramingConcepts;

public class SpecialCharacter {

	public static void main(String[] args) {
     String s="&&&&&&&&&&&&Nayana&@*#@$(#($(#^($%^$%6";
     
    String s1= s.replaceAll("[^a-zA-Z0-9]", "");
     
     System.out.println(s1);
     		

	}

}
