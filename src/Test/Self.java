package Test;

class Self {

		   
		 static void display(int num, String... values){  
		  System.out.println("the number is " + num);  
		  for(String s:values) {
			  System.out.println(s);
		  }
		 }  
		  
		 public static void main(String args[]){  
		  
		 
		 display(5000,"hello");
		 display(10000,"my","name","is","varargs");//four arguments  
		 }   
		}  
	


