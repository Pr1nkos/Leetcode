package PowerOfTwo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        log.info(String.valueOf(solution.isPowerOfTwo(16)));
    }
}
