class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length];
        int positiveNumIndex = 0;
        int negativNumIndex = 1;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] > 0){
            arr[positiveNumIndex] = nums[i];
                positiveNumIndex+=2;
            }else{
            arr[negativNumIndex] = nums[i];
            negativNumIndex+=2;
            }
            
        }
        return arr;
        
    }
}