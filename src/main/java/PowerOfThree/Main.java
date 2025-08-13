package PowerOfThree;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 21;
        boolean powerOfThree = solution.isPowerOfThree(num);
        System.out.println(powerOfThree);
    }
}
