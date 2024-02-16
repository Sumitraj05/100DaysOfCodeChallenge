class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int count = 0;
        int k= 0;
        while(i<nums.length){
            int j = i+1;
            while(j<nums.length){
                if(nums[i] == nums[j]){
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
            nums[k] = nums[i]; 
            k = k+1;
            count += 1;
            i++;
           
        }
        return count;
    }
}
