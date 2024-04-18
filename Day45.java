class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count  = new int[26];
        for(int i = 0; i<chars.length(); i++){
            count[chars.charAt(i)-'a']++;
        }
        int res = 0;
        for(String j : words){
            if(func(j, count)){
                res += j.length();
            }
        }
        return res;
    }
    boolean func(String s , int[] count){
        int[] c = new int [26];
        for(int i = 0; i<s.length(); i++){
            int x = s.charAt(i)-'a';
            c[x]++;
            if(c[x]>count[x]){
                return false;
            }
        }
        return true;
    }
}
