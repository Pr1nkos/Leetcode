package BuildArrayFromPermutation;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5,0,1,2,3,4};
        int[] ints = solution.buildArray(nums);
        log.info(Arrays.toString(ints));
    }
}
