class Solution {
    public int maxProductDifference(int[] nums) {
        int firstbig = 0, secondbig = 0;
        int firstsmall = Integer.MAX_VALUE , secondsmall = Integer.MAX_VALUE;
        for(int n : nums){
            if(n<firstsmall){
                secondsmall = firstsmall;
                firstsmall = n;
            }
            else if (n<secondsmall){
                secondsmall = n;
            }
            if(n>firstbig){
                secondbig = firstbig;
                firstbig = n;
            }
            else if(n>secondbig){
                secondbig = n;
            }
        }
        return (firstbig*secondbig - firstsmall*secondsmall);
    }
}
