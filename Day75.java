class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        for(int i = s.length()-1; i>0; i--){
            for(int j = 0; j+i<s.length(); j++){
                if(s.charAt(j) == s.charAt(j+i)) return i-1;
            }
        }
        return -1;
    }

}
