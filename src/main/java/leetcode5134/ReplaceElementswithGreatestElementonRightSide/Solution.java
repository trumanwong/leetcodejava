package leetcode5134.ReplaceElementswithGreatestElementonRightSide;

import java.util.*;

public class Solution {
    public int[] replaceElements(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
                continue;
            }
            map.put(arr[i], 1);
            list.add(arr[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = -1;
            } else if (arr[i] == list.get(list.size() - 1) && map.get(arr[i]) == 1 && list.size() > 1) {
                map.put(arr[i], map.get(arr[i]) - 1);
                arr[i] = list.get(list.size() - 2);
                list.remove(list.size() - 1);
            } else {
                map.put(arr[i], map.get(arr[i]) - 1);
                int temp = arr[i];
                arr[i] = list.get(list.size() - 1);
                if (map.get(temp) == 0) {
                    list.remove(list.indexOf(temp));
                }
            }
        }
        return arr;
    }
}
