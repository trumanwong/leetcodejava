package leetcode5295.FindNUniqueIntegersSumuptoZero;

import java.util.Arrays;

public class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int step = 0;
        int mid = n / 2;
        if (n % 2 != 0) {
            while (mid + step < n && mid - step >= 0) {
                res[mid + step] = step;
                res[mid - step] = -step;
                step++;
            }
        } else {
            int l = mid - 1;
            step = 1;
            while (l >= 0 && mid < n) {
                res[l] = -step;
                res[mid] = step;
                l--;
                mid++;
                step++;
            }
        }
        return res;
    }
}
