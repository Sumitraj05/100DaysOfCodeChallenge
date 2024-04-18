class Solution {
    public int maxScore(String s) {
        int length = s.length();
        int ones = 0;
        int zeros = 0;
        int score = Integer.MIN_VALUE;
        for (int i = 0; i <= length - 2; i++) {
            if (s.charAt(i) == '1') {
                ones++;
            } else {
                zeros++;
            }
            score = Math.max(score, zeros-ones);
        }
        if(s.charAt(length-1)  == '1'){
            ones++;
        }
        return score + ones;
    }
}
