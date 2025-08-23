package FindTheMinimumAreaToCoverAllOnesI;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {
                {0, 1, 0},
                {1, 0, 1}
        };
        log.info(String.valueOf(solution.minimumArea(grid)));
    }
}
