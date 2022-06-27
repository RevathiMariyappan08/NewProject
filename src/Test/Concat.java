package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Concat {

	@Test
	void test() {
		Class1 c=new Class1();
	String result=c.concat("jai","shree");
	assertEquals("jaishree",result);
		
	}

}
