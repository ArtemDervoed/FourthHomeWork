import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {
Matrix utilite = new Matrix(3,5);
	@Test
	public void testMultiply() throws Exception {
		double first [][] = {{1,2,3,4},
                             {2,3,1,4}};
		
        double result [][] = {{15,3,12},
                              {25,5,19}};
         assertArrayEquals(utilite.multiply(first),result);
	}
	
	@Test
	public void testMultiplyNullMatrix() throws Exception {
		 double second [][] = null;   
         double result [][] = null;
         assertArrayEquals(utilite.multiply(second),result);
	}
	@Test
	public void testSumm() throws Exception {
		double first [][] = {{1,2,3,4},
                             {2,3,1,4}};

		double result [][] = {{15,3,12},
                              {25,5,19}};
         assertArrayEquals(utilite.summ(first),result);
	}
	@Test
	public void testSummNull() throws Exception {
		 double second [][] = null;
         double result [][] = null;
         assertArrayEquals(utilite.summ(second),result);
	}
	public void testDifference() throws Exception {
		double first [][] = {{1,2,3,4},
                             {2,3,1,4}};
		
		double result [][] = {{15,3,12},
                              {25,5,19}};
         assertArrayEquals(utilite.difference(first),result);
	}
	@Test
	public void testDifferenceNull() throws Exception {
		 double second [][] = null;
         double result [][] = null;
         assertArrayEquals(utilite.difference(second),result);
	}
}
