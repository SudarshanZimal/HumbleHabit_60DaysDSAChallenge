class Solution {
    public int majorityElement(int[] nums) {
        int cnt =0;
        int ans = 0;
        for( int i = 0 ; i < nums.length ; i++){
            if(cnt == 0)ans = nums[i];
            if(ans==nums[i])cnt++;
            else cnt--;  
        }
        return ans;
    }
}