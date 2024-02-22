class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftidx = binary(nums, target, true);
        int rightidx = binary(nums, target, false);
        if(leftidx <= rightidx){
            return new int[]{leftidx, rightidx};
        }else{
            return new int[]{-1,-1};
        }
    }
    
    public static int binary(int[] nums, int target, boolean find){
        int low = 0;
        int high = nums.length - 1;
        int idx = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                idx = mid;
                if(find){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            } else if(nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return idx;
    }
}
