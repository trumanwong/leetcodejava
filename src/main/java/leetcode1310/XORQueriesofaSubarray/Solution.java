package leetcode1310.XORQueriesofaSubarray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] pre = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] ^ arr[i - 1];
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = pre[queries[i][0]] ^ pre[queries[i][1] + 1];
        }
        return res;
    }
}
