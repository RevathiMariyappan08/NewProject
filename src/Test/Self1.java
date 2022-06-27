package Test;
import java.util.regex.*;  





public class Self1 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches(); 
		System.out.println(b);
		//boolean b3 = Pattern.matches(".s", "as");  
		  
		//System.out.println(b3);  
		}

	}
