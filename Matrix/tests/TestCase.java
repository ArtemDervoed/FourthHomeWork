import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {
	double first[][] = { { 1, 2 }, 
                         { 2, 3 } };
	
Matrix utilite = new Matrix(first);
	@Test
	public void testMultiply() throws Exception {
		
        double second[][] = { { 5, 1 }, 
                              { 5, 1 }, };

        double result[][] = { { 15, 3 }, 
	                          { 25, 5 } };
         assertArrayEquals(utilite.multiply(second),result);
	}
	
	@Test
	public void testMultiplyNullMatrix() throws Exception {
		 double second [][] = null;   
         double result [][] = null;
         assertArrayEquals(utilite.multiply(second),result);
	}
	@Test
	public void testSumm() throws Exception {
		double second [][] = { { 1, 2 },
                               { 2, 3 } };

		double result [][] = { { 2, 4 },
                               { 4, 6 } };
         assertArrayEquals(utilite.summ(first),result);
	}
	@Test
	public void testSummNull() throws Exception {
		 double second [][] = null;
         double result [][] = null;
         assertArrayEquals(utilite.summ(second),result);
	}
	@Test
	public void testDifference() throws Exception {
		double second [][] = { { 6, 6 },
                               { 5, 5 } };
		
		double result [][] = { { -5, -4 },
                               { -3, -2 } };
         assertArrayEquals(utilite.difference(second),result);
	}
	@Test
	public void testDifferenceNull() throws Exception {
		 double second [][] = null;
         double result [][] = null;
         assertArrayEquals(utilite.difference(second),result);
	}
	@Test
	public void testDeterminantTwoOnTwo() throws Exception {
		double items [][] = { { 1, 2 }, 
                              { 2, 3 } };
        Matrix firstUtilite = new Matrix(items);
	    double test = firstUtilite.determinant();
	    double control = 0;
            if(test == control){
        	    assertTrue(true);
            }
            else{
        	    assertFalse(false);
            }
        }
	@Test
	public void testDeterminantThreeOnThree() throws Exception {
		double items [][] = { { 2, 4, 1 }, 
                              { 4, 4, 4 },
                              { 4, 4, 4 } };
        Matrix firstUtilite = new Matrix(items);
	    double test = firstUtilite.determinant();
	    double control = 36;
            if(test == control){
        	    assertTrue(true);
            }
            else{
        	    assertFalse(false);
            }
        }
	@Test
	public void testDeterminantFourOnFour() throws Exception {
		double items [][] = { { 5, 7, 4, 1 }, 
                              { 1, 7, 7, 7 },
                              { 4, 4, 1, 4 },
                              { 4, 4, 7, 7 }};
        Matrix firstUtilite = new Matrix(items);
	    double test = firstUtilite.determinant();
	    double control = -900;
            if(test == control){
        	    assertTrue(true);
            }
            else{
        	    assertFalse(false);
            }
        }
    }
