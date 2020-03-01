package leetcode0703;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

    @Test
    void add() {
        KthLargest largest = new KthLargest(3, new int[]{4, 5, 8, 2});
        assertEquals(4, largest.add(3));
        assertEquals(5, largest.add(5));
        assertEquals(5, largest.add(10));
        assertEquals(8, largest.add(9));
        assertEquals(8, largest.add(4));
    }
}