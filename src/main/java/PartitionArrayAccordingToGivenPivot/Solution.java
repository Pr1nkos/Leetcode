package PartitionArrayAccordingToGivenPivot;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        List<Integer> equals = new ArrayList<>();
        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            }
            if (num > pivot) {
                greater.add(num);
            }
            if (num == pivot) {
                equals.add(num);
            }
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(less);
        result.addAll(equals);
        result.addAll(greater);
        return result.stream().mapToInt(x -> x).toArray();
    }
}
