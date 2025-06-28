package SumOfAllSubsetXORTotals;

class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int orResult = 0;

        for (int num : nums) {
            orResult = orResult | num;
        }

        return orResult << (n - 1);
    }
}