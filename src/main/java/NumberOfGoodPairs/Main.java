package NumberOfGoodPairs;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1, 2, 3, 1, 1, 3};
        int i = solution.numIdenticalPairs(ints);
        System.out.println(i);
    }
}
