package FinalValueOfVarAfterPerfomingOperations;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] stringArray = {"++X","++X","X++"};
        System.out.println(solution.finalValueAfterOperations(stringArray));
    }
}
