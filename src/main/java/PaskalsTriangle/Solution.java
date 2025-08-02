package PaskalsTriangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows < 1) return new ArrayList<>();
        if (numRows == 1) return new ArrayList<>(List.of(List.of(1)));
        if (numRows == 2) return new ArrayList<>(List.of(List.of(1), List.of(1, 1)));

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1));
        triangle.add(List.of(1, 1));
        for (int i = 2; i < numRows; i++) {
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1);
            for (int j = 1; j < i; j++) {
                triangle.get(i).add(triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j - 1));
            }
            triangle.get(i).add(1);
        }
        return triangle;
    }
}