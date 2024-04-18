class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int [26];
        int n = words.length;

        for(String s : words){
            for(char p : s.toCharArray()){
                freq[p - 'a']++;
            }
        }
        for(int i : freq){
            if(i%n != 0) return false;
        }
        return true;

        // return Arrays.stream(freq).allMatch(c -> c %n == 0);
        
    }
}
