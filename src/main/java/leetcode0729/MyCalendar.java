package leetcode0729;

import java.util.ArrayList;
import java.util.List;

public class MyCalendar {
    private List<int[]> list;
    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] v : list) {
            if (start < v[1] && end > v[0]) {
                return false;
            }
        }
        list.add(new int[]{start, end});
        return true;
    }
}
