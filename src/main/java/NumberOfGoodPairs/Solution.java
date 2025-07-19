package NumberOfGoodPairs;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        AtomicInteger numberOfGoodPairs = new AtomicInteger();
        Arrays.sort(nums);
        Map<Integer, Integer> mapOfSubArrays = new HashMap<>();
        if (nums.length <= 1) {
            return 0;
        }
        for (int num : nums) {
            if (mapOfSubArrays.containsKey(num)) {
                mapOfSubArrays.put(num, mapOfSubArrays.get(num) + 1);
            }
            else {
                mapOfSubArrays.put(num, 1);
            }
        }

        mapOfSubArrays.forEach((key, value) -> {
            while (value > 1){
                numberOfGoodPairs.getAndAdd(value - 1);
                value--;
            }
        });
        return numberOfGoodPairs.get();
    }
}