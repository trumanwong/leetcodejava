package leetcode5334;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TweetCountsTest {

    @Test
    void recordTweet() {
        String[] operates = new String[]{"TweetCounts", "recordTweet", "recordTweet", "recordTweet", "getTweetCountsPerFrequency", "getTweetCountsPerFrequency", "recordTweet", "getTweetCountsPerFrequency"};
        Object[][] vals = new Object[][]{{}, {"tweet3", 0}, {"tweet3", 60}, {"tweet3", 10}, {"minute", "tweet3", 0, 59}, {"minute", "tweet3", 0, 60}, {"tweet3", 120}, {"hour", "tweet3", 0, 210}};

        TweetCounts counts = new TweetCounts();
        for (int i = 0; i < operates.length; i++) {
            if (operates[i].equals("TweetCounts")) {
                counts = new TweetCounts();
            } else if (operates[i].equals("recordTweet")) {
                counts.recordTweet(vals[i][0].toString(), (Integer) vals[i][1]);
            } else if (operates[i].equals("getTweetCountsPerFrequency")) {
                System.out.println(counts.getTweetCountsPerFrequency(vals[i][0].toString(), vals[i][1].toString(), (Integer) vals[i][2], (Integer) vals[i][3]));
            }
        }
    }
}