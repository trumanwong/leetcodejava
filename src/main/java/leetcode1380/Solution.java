package leetcode1380;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        List<Integer> rows = new ArrayList<>();
        for (int[] ints : matrix) {
            int min = ints[0];
            for (int j = 1; j < ints.length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                }
            }
            rows.add(min);
        }

        for (int j = 0; j < matrix[0].length; j++) {
            int max = matrix[0][j];
            int index = 0;
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    index = i;
                }
            }
            if (rows.get(index) == max) {
                res.add(max);
            }
        }
        return res;
    }
}
