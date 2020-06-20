package LCCI.GuessNumbers;

public class Solution {
    public int game(int[] guess, int[] answer) {
        int res = 0;
        for (int i = 0; i < guess.length; i++) {
            if (answer[i] == guess[i]) {
                res++;
            }
        }
        return res;
    }
}