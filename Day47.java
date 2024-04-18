class Solution {
    public String largestGoodInteger(String num) {
        
        int sum = -1;
        
        for(int i = 0; i<num.length()-2; i++){
           
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                sum = Math.max(sum,num.charAt(i) - '0');
               
            }
        }
       StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            builder.append((char)(48 + sum));
        }
        return sum == -1 ? "" : builder.toString();
    }
}
