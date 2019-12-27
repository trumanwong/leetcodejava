package leetcode1286.IteratorforCombination;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationIteratorTest {
    @Test
    void testCombinationIterator() {
        CombinationIterator iterator = new CombinationIterator("abc", 2);
        assertEquals("ab", iterator.next());
        assertEquals("ac", iterator.next());
        assertEquals("bc", iterator.next());
        assertEquals(false, iterator.hasNext());
    }
}