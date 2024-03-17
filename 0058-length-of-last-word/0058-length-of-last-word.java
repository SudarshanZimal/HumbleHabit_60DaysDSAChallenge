public class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int len = 0;
        int i = n - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}