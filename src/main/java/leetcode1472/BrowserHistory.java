package leetcode1472;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private String[] browsers;
    private int cur;
    private int max;

    public BrowserHistory(String homepage) {
        this.browsers = new String[5000];
        this.cur = this.max = 0;
        visit(homepage);
    }

    public void visit(String url) {
        this.browsers[this.cur++] = url;
        this.max = this.cur;
    }

    public String back(int steps) {
        this.cur = Math.max(this.cur - steps, 1);
        return this.browsers[this.cur - 1];
    }

    public String forward(int steps) {
        this.cur = Math.min(this.cur + steps, this.max);
        return this.browsers[this.cur - 1];
    }
}
