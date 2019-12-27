package leetcode0413.ArithmeticSlices;

public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        int res = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                count++;
                res += count;
            } else {
                count = 0;
            }
        }
        return res;
    }
}
