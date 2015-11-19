import static org.junit.Assert.*;
import org.junit.Test;

public class testArrayUtilite {
ArrayUtilite tester = new ArrayUtilite();
int[] firstTesting = {1,2,3,4,5,6};
int[] secondTing = {1};
int[] thirdTesting = {1,2,3,4,5,6,0,0};
int[] testingNull = {0,0,0} ;

    @Test
    public void testChangeOfSizeLower() throws Exception {
		
    assertArrayEquals(tester.changeSize(firstTesting, 1),secondTing);
    }
	
    @Test
    public void testChangeOfSizeHeighter() throws Exception {
		
    assertArrayEquals(tester.changeSize(firstTesting, 8),thirdTesting);
    }
	
    @Test
    public void testChangeOfSizeNull() throws Exception {
		
    assertArrayEquals(tester.changeSize(null, 3),testingNull);
	}
	
    @Test
    public void testEqualseWidthAhyData() throws Exception {
        int[] first = {1,2,3,4,5,6};
        int[] second = {1};
    assertEquals(tester.equal(first, second),false);
    }
	
    @Test
    public void testEqualseWidthEqualsData() throws Exception {
        int[] first = {1,2,3,4,5,6};
        int[] third = {3,4,5,6,1,2};
    assertEquals(tester.equal(first, third),true);
    }
}
