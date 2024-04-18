class Solution {
    public int[][] imageSmoother(int[][] img) {
        int rowLast = img.length - 1;
        int colLast = img[0].length - 1;
        if (rowLast == 0) {     
            if (colLast != 0)  singleRow(img[0], colLast);
        }
        else if (colLast == 0) {  
            singleCol(img, rowLast);
        }
              else {                    
            for (int row = 0; row <= rowLast; row++)    
                sumRow(img[row], colLast);
            sumCol(img, 0, 4, 6, rowLast);                
            sumCol(img, colLast, 4, 6, rowLast);         
            for (int col = 1; col < colLast; col++)     
                sumCol(img, col, 6, 9, rowLast);
        }
        return img;
    }
    private void singleRow(int[] MR, int colLast) {
        int prev = 0;
        int curr = MR[0];
        int next = MR[1];
        MR[0] = (curr + next) / 2;
        for (int col = 1; col < colLast; col++) {
            prev = curr;
            curr = next;
            next = MR[col+1];
            MR[col] = (prev + curr + next) / 3;
        }
        MR[colLast] = (next + curr) / 2;
    }
    private void singleCol(int[][] M, int rowLast) {
        int prev = 0;
        int curr = M[0][0];
        int next = M[1][0];
        M[0][0] = (curr + next) / 2;
        for (int row = 1; row < rowLast; row++) {
            prev = curr;
            curr = next;
            next = M[row+1][0];
            M[row][0] = (prev + curr + next) / 3;
        }
        M[rowLast][0] = (next + curr) / 2;
    }
    private void sumRow(int[] MR, int colLast) {
        int prev = 0;
        int curr = 0;
        int next = MR[0];
        for (int col = 0; col < colLast; col++) {
            prev = curr;
            curr = next;
            next = MR[col+1];
            MR[col] = prev + curr + next;
        }
        MR[colLast] = next + curr;
    }
    private void sumCol(int[][] M, int col, int endDiv, int midDiv, int rowLast) {
        int prev = 0;
        int curr = M[0][col];
        int next = M[1][col];
        M[0][col] = (curr + next) / endDiv;
        for (int row = 1; row < rowLast; row++) {
            prev = curr;
            curr = next;
            next = M[row+1][col];
            M[row][col] = (prev + curr + next) / midDiv;
        }
        M[rowLast][col] = (next + curr) / endDiv;
}
}
