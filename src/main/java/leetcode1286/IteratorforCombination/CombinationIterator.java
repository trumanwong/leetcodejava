package leetcode1286.IteratorforCombination;

import java.util.Arrays;

public class CombinationIterator {
    private int[] pos;
    private String s;
    private boolean finished;
    public CombinationIterator(String characters, int combinationLength) {
        this.s = characters;
        this.pos = new int[combinationLength];
        for (int i = 0; i< combinationLength; i++) {
            this.pos[i] = i;
        }
        this.finished = false;
    }

    public String next() {
        StringBuilder res = new StringBuilder();
        for (int p : this.pos) {
            res.append(this.s.charAt(p));
        }
        int i = -1;
        for (int k = pos.length - 1; k >= 0; k--) {
            if (pos[k] != s.length() - pos.length + k) {
                i = k;
                break;
            }
        }

        if (i == -1) {
            finished = true;
        } else {
            ++pos[i];
            for (int j = i + 1; j < pos.length; ++j) {
                pos[j] = pos[j - 1] + 1;
            }
        }
        return res.toString();
    }

    public boolean hasNext() {
        return !finished;
    }
}
