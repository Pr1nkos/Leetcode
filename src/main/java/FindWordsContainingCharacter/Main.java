package FindWordsContainingCharacter;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String [] words = {"abc","bcd","aaaa","cbc"};
        List<Integer> e = solution.findWordsContaining(words, 'z');
        log.info(e.toString());
    }
}
