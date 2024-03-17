class Solution {
    public int lengthOfLastWord(String s) {
        s =  s.trim();
        int str = s.length()-1;
        int i;
        for(i=str;i>=0;i--) 
            if(s.charAt(i) == ' ') break;  
        return (str-i);
    }
 }