package Largest3SameDigitNumberInString;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "1221000";
        System.out.println(solution.largestGoodInteger(str1));
    }
}
