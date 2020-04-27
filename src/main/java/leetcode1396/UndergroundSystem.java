package leetcode1396;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {

    Map<Integer, Pair<String, Integer>> map;
    Map<String, Pair<Integer, Double>> time;

    public UndergroundSystem() {
        map = new HashMap<>();
        time = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        map.put(id, new Pair<>(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> nameAndTime = map.get(id);
        // 将入站和出站的stationName加起来作为map的key
        String key = nameAndTime.getKey() + stationName;

        Pair<Integer, Double> pair = time.getOrDefault(key, new Pair<>(0, 0.0));

        Integer range = t - nameAndTime.getValue() + pair.getKey();
        Double count = pair.getValue() + 1.0;
        // 再把<时间，次数>组合成一个pair
        time.put(key, new Pair<>(range, count));
        map.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + endStation;
        Pair<Integer, Double> pair = time.get(key);
        return pair.getKey() / pair.getValue();
    }
}
