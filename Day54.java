class Solution {
    public int findSpecialInteger(int[] arr) {
        int[] freq = new int[100001];
        for(int i = 0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        int k = 0;
        int ind = 0;
        for(int j = 1; j<freq.length; j++){
            if(freq[j]>k){
                ind = j;
                k = freq[j];
            }

        }
        return ind;

    }
}
