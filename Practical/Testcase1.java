import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testcase1 {

	@Test
	void test() {
		Operation op= new Operation();
		int result=op.sum(1, 3);
		assertEquals(4, result,"values not same");
		
	}
	@Test
	void test1() {
		Operation op= new Operation();
		int result=op.sum(1, 3);
		assertEquals(2, result,"values not same");
		
	}
	@Test
	void test2() {
		Operation op= new Operation();
		int result=op.greaterBeetweenThree(1,3,4);
		assertEquals(4, result,"values not same");
		
	}

	@Test
	void test3() {
		Operation op= new Operation();
		int result=op.greaterBeetweenThree(1,3,4);
		assertEquals(3, result,"values not same");
		
	}
	@Test
	void test4() {
		Operation op= new Operation();
		int result=op.smallerBeetweenThree(1,3,4);
		assertEquals(1, result,"values not same");
		
	}
	@Test
	void test5() {
		Operation op= new Operation();
		int result=op.smallerBeetweenThree(1,3,4);
		assertEquals(3, result,"values not same");
		
	}
	@Test
	void test6() {
		String str="mom";
		Operation op= new Operation();
		String result=op.reverseString(str);
		assertEquals(str, result,"values not same");
		
	}
	@Test
	void test7() {
		String str="man";
		Operation op= new Operation();
		String result=op.reverseString(str);
		assertEquals(str, result,"values not same");
		
	}
	@Test
	void test8() {
		int exp[]= {2,4,6,8,10,12,14,16,18,20};
		Operation op= new Operation();
		int actualResult[]=op.table(2);
		assertArrayEquals(exp, actualResult);
		
	}
	@Test
	void test9() {
		int exp[]= {2,4,6,8,10,12,14,16,18,20};
		Operation op= new Operation();
		int actualResult[]=op.table(3);
		assertArrayEquals(exp, actualResult);
		
	}
	@Test
	void test10() {
		String s=null;
		assertNull(s, "value not null");
	}
	@Test
	void test11() {
		String s="hello";
		assertNull(s, "value not null");
	}
	@Test
	void test12() {
		String s="hello";
		assertNotNull(s, "value is null");
	}
	@Test
	void test13() {
		String s=null;
		assertNotNull(s, "value is null");
	}
	@Test
	void test14() {
		
		assertTrue(12>2, "value is not true");
	}
	@Test
	void test15() {
		
		assertTrue(12<2, "value is not true");
	}
	@Test
	void test16() {
		
		assertFalse(12<2, "value is not false");
	}
	@Test
	void test17() {
		
		assertFalse(12>2, "value is not false");
	}
	

}
