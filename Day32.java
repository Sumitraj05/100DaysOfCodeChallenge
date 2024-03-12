class Solution {
    public int minPairSum(int[] nums){
        Arrays.sort(nums);
        int i = 0 , j = nums.length-1;
        int result = 0;
        while(i<j){
            int val = nums[i]+nums[j];
            result = Math.max(result,val);
            ++i;
            --j;
        }
        return result;
    }
}
