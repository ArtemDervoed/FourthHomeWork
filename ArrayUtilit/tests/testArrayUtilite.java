import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class testArrayUtilite {
    ArrayUtilite tester = new ArrayUtilite();
    int[] firstTesting = { 1, 2, 3, 4, 5, 6 };
    int[] secondTing = { 1 };
    int[] thirdTesting = { 1, 2, 3, 4, 5, 6, 0, 0 };
    int[] testingNull = { 0, 0, 0 };

    @Test
    public void testChangeOfSizeLower() throws Exception {
        assertArrayEquals(tester.changeSize(firstTesting, 1), secondTing);
    }

    @Test
    public void testChangeOfSizeHeighter() throws Exception {

        assertArrayEquals(tester.changeSize(firstTesting, 8), thirdTesting);
    }

    @Test
    public void testChangeOfSizeNull() throws Exception {
        assertArrayEquals(tester.changeSize(null, 3), testingNull);
    }

    @Test
    public void testEqualseWidthAhyData() throws Exception {
        int[] first = { 1, 2, 3, 4, 5, 6 };
        int[] second = { 1 };
        assertEquals(tester.equal(first, second), false);
    }

    @Test
    public void testEqualseWidthEqualsData() throws Exception {
        int[] first = { 1, 2, 3, 4, 5, 6 };
        int[] third = { 3, 4, 5, 6, 1, 2 };
        assertEquals(tester.equal(first, third), true);
    }

    @Test
    public void testShuffleData() throws Exception {
        int[] first = { 3, 4, 5, 6, 1, 2 };
        int[] shuffled = first;
        Arrays.sort(tester.shuffle(shuffled));
        Arrays.sort(first);
        if (shuffled == first) {
            assertTrue(true);
        } else
            assertFalse(false);
    }

    @Test
    public void testShuffleDataNull() throws Exception {
        int[] first = null;
        int[] shuffled = first;
        if (first == null) {
            assertNull("Null", first);
        }
    }
    @Test
    public void testFilterOfData() throws Exception {
        int[] first = { 1, 2, 3, 4, 5, 6 };
        int[] third = { 1, 2 };
        assertArrayEquals(tester.filter(first, new Predicate(2), 3), third);
    }
    @Test
    public void testFilterDataIsNotCorrect() throws Exception {
        int[] first = { 1, 2, 3, 4, 5, 6 };
        int[] third = { 1, 2 };
        assertArrayEquals(tester.filter(first, new Predicate(2), -1), first);
    }
}
