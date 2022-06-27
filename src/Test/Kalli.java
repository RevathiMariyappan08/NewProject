package Test;

import java.util.regex.Pattern;

public class Kalli {
	public static void main(String[] args) {

System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)
System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  

		
	}

}
