package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Add {

	@Test
	void test() {
		Class1 c=new Class1();
		int result=c.add(5,8);
		assertEquals(15,result);
	}

}
