class Solution {
    public static int returNlength(String s) {
		int ind = s.lastIndexOf(" ");
		int result = 0;
		if(ind!=-1 && ind!=s.length()-1) {
			String ss = s.substring(ind,s.length()-1);
			result = ss.length();
		}else if(ind!=-1 && ind==s.length()-1) {
			String ss = s.substring(0,ind);
			result = returNlength(ss);
		}else if(ind==-1){
			result = s.length();
		}
		return result;
	}
    public int lengthOfLastWord(String s) {
    	return returNlength(s);		 
    }
}