package recursive.reverseString;

public class Solution {
    public void reverseString(char[] s) {
        recursive(s, 0, s.length - 1);
    }

    private void recursive(char[] s, int l, int r) {
        if (l >= r) {
            return;
        }
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        l++;
        r--;
        recursive(s, l, r);
    }
}
