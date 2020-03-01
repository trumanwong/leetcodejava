package leetcode1324;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void printVertically() {
        Solution solution = new Solution();
        assertEquals(new ArrayList<>(Arrays.asList("HAY", "ORO", "WEU")), solution.printVertically("HOW ARE YOU"));
        assertEquals(new ArrayList<>(Arrays.asList("TBONTB", "OEROOE", "   T")), solution.printVertically("TO BE OR NOT TO BE"));
        assertEquals(new ArrayList<>(Arrays.asList("CIC","OSO","N M","T I","E N","S G","T")), solution.printVertically("CONTEST IS COMING"));
    }
}