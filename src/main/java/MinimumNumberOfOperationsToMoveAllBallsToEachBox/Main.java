package MinimumNumberOfOperationsToMoveAllBallsToEachBox;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.minOperations("001011");
        log.info(Arrays.toString(ints));
    }
}
