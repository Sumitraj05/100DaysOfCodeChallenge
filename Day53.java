class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] trap = new int[c][r];
        for(int i = 0; i<c; i++){
            for(int j = 0; j < r; j++){
                trap[i][j] = matrix[j][i];
               
            }
        }
        return trap;
    }
}
