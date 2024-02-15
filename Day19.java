class Solution {
    public boolean isHappy(int n) {
        int j = 1;
        int sum = 0;
        while(j++ < 8){
            sum = 0;
            while(n>0){
                int a1 = n%10;
                int square = a1*a1;
                sum += square;
                n = n/10;
            }
            if(sum == 1){
                return true;
            }
            else{
               n = sum;
            }
        }
        return false;
    }
}
