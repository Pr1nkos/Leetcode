package ConcatenationOfArray;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 1};
        int[] concatenation = solution.getConcatenation(nums);
        log.info(Arrays.toString(concatenation));
    }
}
