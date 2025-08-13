package WaysToExpressAnIntegerAsSumOfPowers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfWays(10, 2));
    }
}
