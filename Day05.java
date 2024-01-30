class Solution {
     public static int divide(int dividend, int divisor) {
       if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

       boolean IsNegative = dividend <0 ^ divisor <0;

       dividend = Math.abs(dividend);
       divisor = Math.abs(divisor);

       int questient = 0;
       while(dividend - divisor >= 0){
           int curdivisor = divisor;
           int curquestient = 1;
           while(dividend - (curdivisor<<1) >= 0){
               curdivisor = curdivisor<<1;
               curquestient = curquestient<<1;
           }
           questient += curquestient;
           dividend -= curdivisor; 
       }
       return IsNegative? -questient : questient;
    }
}
