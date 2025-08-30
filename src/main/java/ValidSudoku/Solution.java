package ValidSudoku;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                if (set.contains(c)) return false;
                set.add(c);
            }
        }
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (c == '.') continue;
                if (set.contains(c)) return false;
                set.add(c);
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSquare(board, i, j)) return false;
            }
        }
        return true;
    }

    private boolean isValidSquare(char[][] board, int index1, int index2) {
        Set<Character> set = new HashSet<>();
        for (int i = index1; i < index1 + 3; i++) {
            for (int j = index2; j < index2 + 3; j++) {
                if  (board[i][j] == '.') continue;
                if (set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }
        return true;
    }
}