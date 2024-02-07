class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int MOD = (int)1e9+7;
        int n = arr.length;
        Arrays.sort(arr);
        Map<Integer, Long> map = new HashMap();
        for(int i = 0; i < n; i++)
            map.put(arr[i],1L);
        for(int i=1; i<n; i++){
            long count = 0L;
            for(int j = 0; j < i; j++){
                if (arr[i] % arr[j] == 0){
                    int right = arr[i]/arr[j];
                    if (map.containsKey(right)){
                        count= (count + (map.get(right)*map.get(arr[j]))) % MOD;
                    }
                }
            }
            map.put(arr[i], (map.get(arr[i])+count) % MOD);
        }
        long result = 0;
        for(long val: map.values())
            result+=val;
        return (int) (result % MOD);
    }
}
