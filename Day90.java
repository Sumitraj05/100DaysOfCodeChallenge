class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] total = new int[100001];
        for(int i= 0; i<matches.length; i++){
            int win = matches[i][0];
            int loss = matches[i][1];
            if(total[win] == 0){
                total[win] = -1;
            }
            if(total[loss] == -1){
                total[loss] = 1;
            }
            else{
                total[loss]++;
            }
        }
        List<Integer> ZeroLoss = new ArrayList<>();
        List<Integer> OneLoss = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i<total.length; i++){
            if(total[i] == -1){
                ZeroLoss.add(i);
            }
            else if(total[i] == 1){
                OneLoss.add(i);
            }
        }
        result.add(ZeroLoss);
        result.add(OneLoss);

        return result;
    }
}
