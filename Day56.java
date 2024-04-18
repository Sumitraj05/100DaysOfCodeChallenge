class Solution {
    public int numSpecial(int[][] mat) {
        int sum = 0;
        int[] row = new int [mat.length];
        int[] column = new int[mat[0].length];
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    row[i]++;
                    column[j]++;
                    
                }
            }
        }
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j] == 0) continue;
                if(row[i] == 1 && column[j] == 1){
                    sum += 1;
                    
                }
            }
        }

        return sum;
    }
}
