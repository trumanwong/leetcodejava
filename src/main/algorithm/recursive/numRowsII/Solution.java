package recursive.numRowsII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        long cur = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int)cur);
            cur = cur * (rowIndex - i) / (i + 1);
        }
        return res;
    }
}
