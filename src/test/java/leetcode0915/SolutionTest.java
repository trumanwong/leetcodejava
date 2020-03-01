package leetcode0915;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void partitionDisjoint() {
        Solution solution = new Solution();
        assertEquals(5, solution.partitionDisjoint(new int[]{5, 0, 3, 6, 1, 8}));
        assertEquals(4, solution.partitionDisjoint(new int[]{1, 1, 1, 0, 6, 12}));
        assertEquals(1, solution.partitionDisjoint(new int[]{1, 2}));
        assertEquals(9, solution.partitionDisjoint(new int[]{24,11,49,80,63,8,61,22,73,85}));
        assertEquals(2, solution.partitionDisjoint(new int[]{6,0,8,30,37,6,75,98,39,90,63,74,52,92,64}));
        assertEquals(87, solution.partitionDisjoint(new int[]{12,75,26,38,56,59,83,55,49,52,27,48,77,21,27,79,54,15,59,22,34,35,81,67,2,41,40,0,73,61,75,8,86,42,49,83,43,16,2,54,26,35,15,63,31,24,51,86,6,35,42,37,83,51,34,21,71,57,61,76,50,1,43,32,19,13,67,87,3,33,38,34,34,84,38,76,52,7,27,49,2,78,56,28,70,6,64,87,100,97,99,97,97,100,100,100,97,89,98,100}));
    }
}