package MinimumNumberOfOperationsToMoveAllBallsToEachBox;

import java.util.*;

public class Solution {
    public int[] minOperations(String boxes) {
        char[] chars = Arrays.copyOf(boxes.toCharArray(), boxes.length());
        int[] ans = new int[boxes.length()];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (boxes.charAt(j) == '1') {
                    if (i < j){
                        ans[i] += j - i;
                    }
                    else if (i > j) {
                        ans[i] += i - j;
                    }
                }
            }
        }
        return ans;
    }
}
