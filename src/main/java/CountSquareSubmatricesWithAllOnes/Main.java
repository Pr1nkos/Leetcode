package CountSquareSubmatricesWithAllOnes;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };
        System.out.println(solution.countSquares(matrix));
    }
}
