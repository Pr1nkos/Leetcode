package Largest3SameDigitNumberInString;

import java.util.Arrays;

class Solution {
    public String largestGoodInteger(String num) {
        char[] chars = num.toCharArray();
        Arrays.sort(chars);
        int count = 1;
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i] == chars[i - 1]) {
                count++;
            }
            if (count == 3) {
                StringBuilder substring = new StringBuilder();
                substring.append(chars[i]);
                substring.append(chars[i]);
                substring.append(chars[i]);
                if (num.contains(substring)) {
                    return substring.toString();
                }
                count = 1;
            }
        }
        return "";
    }
}