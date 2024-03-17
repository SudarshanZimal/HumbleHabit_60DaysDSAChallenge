class Solution {
    public int lengthOfLastWord(String s) {
        
        String str[]=s.split(" ");
        int count=0;
        int len=0;
        for(String word:str)
        {
           count++;

           if(count==str.length)
           {
               len=word.length();
           }

        }
        return len;
    }
}