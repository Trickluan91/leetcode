package org.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindLeastNum {
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr)
            map.merge(i, 1, Integer::sum);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        int count = list.size();
        for(Map.Entry<Integer, Integer> entry : list)
        {
            if(entry.getValue() > k)
                break;
            count--;
            k = k - entry.getValue();
        }

        return count;
    }
}
