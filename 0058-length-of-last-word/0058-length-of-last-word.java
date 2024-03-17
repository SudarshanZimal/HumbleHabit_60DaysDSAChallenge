public class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        String last = str.substring(str.lastIndexOf(' ') + 1);
        int n = last.length();
        return n;
    }
}
