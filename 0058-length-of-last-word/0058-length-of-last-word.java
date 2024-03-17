import java.util.List;
import java.util.Arrays;

public class Solution {
    public int lengthOfLastWord(String s) {
        List<String> words = Arrays.asList(s.split(" "));
        int i = words.size() - 1;
        while (i >= 0 && words.get(i).isEmpty()) {
            i--;
        }
        return words.get(i).length();
    }
}
