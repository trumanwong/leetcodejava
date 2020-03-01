package leetcode5307.ConvertIntegertotheSumofTwoNoZeroIntegers;

import java.util.Arrays;

public class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[2];
        for (int i = 1; i < n; i++) {
            int temp = n - i;
            if (!String.valueOf(i).contains("0") && !String.valueOf(temp).contains("0")) {
                res = new int[]{i, n - i};
            }
        }
        Arrays.sort(res);
        return res;
    }
}
