package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    int[] sortedNumbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91, 101};

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testFor23() {
        assertEquals(5, BonusBinarySearch.binarySearch(sortedNumbers, 23), .001);
    }

    @Test
    public void testFor2() {
        assertEquals(0, BonusBinarySearch.binarySearch(sortedNumbers, 2), .001);
    }

    @Test
    public void testFor5() {
        assertEquals(1, BonusBinarySearch.binarySearch(sortedNumbers, 5), .001);
    }

    @Test
    public void testFor8() {
        assertEquals(2, BonusBinarySearch.binarySearch(sortedNumbers, 8), .001);
    }

    @Test
    public void testFor12() {
        assertEquals(3, BonusBinarySearch.binarySearch(sortedNumbers, 12), .001);
    }

    @Test
    public void testFor16() {
        assertEquals(4, BonusBinarySearch.binarySearch(sortedNumbers, 16), .001);
    }

    @Test
    public void testFor38() {
        assertEquals(6, BonusBinarySearch.binarySearch(sortedNumbers, 38), .001);
    }

    @Test
    public void testFor56() {
        assertEquals(7, BonusBinarySearch.binarySearch(sortedNumbers, 56), .001);
    }

    @Test
    public void testFor72() {
        assertEquals(8, BonusBinarySearch.binarySearch(sortedNumbers, 72), .001);
    }

    @Test
    public void testFor91() {
        assertEquals(9, BonusBinarySearch.binarySearch(sortedNumbers, 91), .001);
    }

    @Test
    public void testForNumberNotInArray() {
        assertEquals(-1, BonusBinarySearch.binarySearch(sortedNumbers, 14), .001);
    }
}
