package leetcode1276;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if (tomatoSlices % 2 != 0 || tomatoSlices < cheeseSlices * 2 || 4 * cheeseSlices < tomatoSlices) {
            return new ArrayList<>();
        }
        return Arrays.asList(tomatoSlices / 2 - cheeseSlices, 2 * cheeseSlices - tomatoSlices / 2);
    }
}
