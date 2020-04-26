package leetcode1394;

public class Solution {
    public int findLucky(int[] arr) {
        int[] temp = new int[501];
        for (int value : arr) {
            temp[value]++;
        }
        for (int i = 500; i >= 1; i--) {
            if (temp[i] == i) {
                return i;
            }
        }
        return -1;
    }
}
