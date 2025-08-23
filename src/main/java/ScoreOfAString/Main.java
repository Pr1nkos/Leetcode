package ScoreOfAString;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("hello".toCharArray());
        log.info(String.valueOf(solution.scoreOfString("hello")));
    }
}
