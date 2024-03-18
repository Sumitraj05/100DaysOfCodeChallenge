class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i = 0;
        int k = piles.length-2;
        int count = 0;
        while(i<k){
            count += piles[k];
            k -= 2;
            i += 1;
        }
        return count;
    }
}
