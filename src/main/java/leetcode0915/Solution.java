package leetcode0915;

public class Solution {
    public int partitionDisjoint(int[] A) {
        int max = Integer.MIN_VALUE, realMax = Integer.MIN_VALUE, res = 0;
        int lastSmall = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                if (max == Integer.MIN_VALUE) {
                    res++;
                    max = A[i];
                    lastSmall = i;
                }
                if (A[i] > realMax) {
                    realMax = A[i];
                }
            } else {
                if (max == A[i] && (i == A.length - 1 || (i + 1 < A.length && A[i + 1] >= max))) {
                    continue;
                }
                if (i - lastSmall == 1) {
                    res++;
                } else {
                    res = i + 1;
                    max = realMax;
                }
                lastSmall = i;
            }
        }
        return res;
    }
}
