package leetcode5313;

public class Solution {
    static double PI = 360;
    static double SCALE = 6;
    public double angleClock(int hour, int minutes) {
        if (hour == 12) {
            hour = 0;
        }
        double h = (hour * 5 + 5 * (double)minutes / 60) * SCALE;
        double m = minutes * SCALE;
        double res = Math.abs(h - m);
        return Math.min(PI - res, res);
    }
}
