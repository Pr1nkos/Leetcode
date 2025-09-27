package LargestTriangleArea;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] points = {{4,6},{6,5},{3,1}};
        System.out.println(solution.largestTriangleArea(points));
    }
}
