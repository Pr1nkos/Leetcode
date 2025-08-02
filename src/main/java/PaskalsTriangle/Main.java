package PaskalsTriangle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int numRows = 2;
        System.out.println(solution.generate(numRows));
    }
}
