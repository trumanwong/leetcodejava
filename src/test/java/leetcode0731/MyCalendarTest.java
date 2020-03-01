package leetcode0731;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalendarTest {

    @Test
    void book() {
        MyCalendarTwo calendar = new MyCalendarTwo();
        assertTrue(calendar.book(10, 20));
        assertTrue(calendar.book(50, 60));
        assertTrue(calendar.book(10, 40));
        assertFalse(calendar.book(5, 15));
        assertTrue(calendar.book(5, 10));
        assertTrue(calendar.book(25, 55));
    }
}