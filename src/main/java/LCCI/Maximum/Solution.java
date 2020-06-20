package LCCI.Maximum;

public class Solution {
    public int maximum(int a, int b) {
        int key = (int) ((((long) a - (long) b) >> 63) & 1);
        return (key ^ 1) * a + key * b;
    }
}
