class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i: arr){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }
            else{
                mp.put(i,1);
            }
        }
        for(Integer j: mp.keySet()){
            int a = mp.get(j);
            for(Integer k: mp.keySet()){
                if(k != j && a == mp.get(k)) return false;
            }
        }
        return true;
    }
}
