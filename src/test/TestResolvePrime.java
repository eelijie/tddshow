package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.ResolvePrime;


public class TestResolvePrime {

private ArrayList<Integer> expectedResult = new ArrayList<Integer>();
	
	@Rule
	public ExpectedException expectedException =ExpectedException.none();

	@Before
	public void clear_expectedResult() {
		expectedResult.clear();
	}
	// 2:2
	@Test
	public void expect_2_when_input_2() {
		expectedResult.add(2);
		assertArrayEquals(expectedResult.toArray(), ResolvePrime
				.resolvePrime(2).toArray());
	}
	
	// 3:3
	@Test
	public void expect_3_when_input_3(){
		expectedResult.add(3);
		assertArrayEquals(expectedResult.toArray(), ResolvePrime.resolvePrime(3).toArray());
	}


	
	// 6 : 2 3
	@Test
	public void expect_2_3_when_input_6(){
		expectedResult.add(2);
		expectedResult.add(3);
		assertArrayEquals(expectedResult.toArray(), ResolvePrime.resolvePrime(6).toArray());
	}
	
	// 14 : 2 7
	@Test
	public void expect_2_7_when_input_14(){
		expectedResult.add(2);
		expectedResult.add(7);
		assertArrayEquals(expectedResult.toArray(), ResolvePrime.resolvePrime(14).toArray());
	}
	
	//  105: 3 5 7
	@Test
	public void expect_3_5_7_when_input_105(){
		expectedResult.add(3);
		expectedResult.add(5);
		expectedResult.add(7);
		assertArrayEquals(expectedResult.toArray(), ResolvePrime.resolvePrime(105).toArray());
	}
	
	// 5005 : 5 7 11 13
	@Test
	public void expect_5_7_11_13_when_input_5005(){
		expectedResult.add(5);
		expectedResult.add(7);
		expectedResult.add(11);
		expectedResult.add(13);
		assertArrayEquals(expectedResult.toArray(), ResolvePrime.resolvePrime(5005).toArray());
	}
	
	// 1 : ArithmeticException("非法输入")
	@Test
	public void expect_ArithmeticException_when_input_1(){
		try {
			ResolvePrime.resolvePrime(1);
			fail("expected a ArithmeticException when input 1 ");
		} catch (ArithmeticException ex) {
			assertEquals(ex.getMessage(), "非法输入");
		}
		
	}

}
