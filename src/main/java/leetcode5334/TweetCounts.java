package leetcode5334;

import java.util.*;

public class TweetCounts {

    Map<String, PriorityQueue<Integer>> map;

    public TweetCounts() {
        map = new HashMap<>();
    }

    public void recordTweet(String tweetName, int time) {
        PriorityQueue<Integer> queue = map.get(tweetName);
        if (queue == null) {
            queue = new PriorityQueue<>();
        }

        queue.offer(time);
        map.put(tweetName, queue);
    }

    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        PriorityQueue<Integer> queue = map.get(tweetName);
        PriorityQueue<Integer> copy = new PriorityQueue<>(queue);
        int delta = 60;
        if (freq.equals("hour")) {
            delta *= 60;
        } else if (freq.equals("day")) {
            delta *= 24 * 60;
        }

        List<Integer> res = new ArrayList<>();
        endTime++;
        int start = startTime;
        int end = Math.min(start + delta, endTime);
        while (start < end) {
            int count = 0;
            while (queue.peek() != null && queue.peek() < start) {
                queue.poll();
            }
            while (queue.peek() != null && queue.peek() >= start && queue.peek() < end) {
                count++;
                queue.poll();
            }
            res.add(count);
            start += delta ;
            end = Math.min(start + delta, endTime);
        }
        map.put(tweetName, copy);
        return res;
    }
}
