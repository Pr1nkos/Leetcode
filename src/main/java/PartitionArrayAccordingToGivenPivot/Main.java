package PartitionArrayAccordingToGivenPivot;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] case1 = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(solution.pivotArray(case1, 10)));
    }
}
