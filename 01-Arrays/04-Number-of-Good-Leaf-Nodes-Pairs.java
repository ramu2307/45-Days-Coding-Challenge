class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean arr[][] = new boolean[rows][cols];

        // First pass : Record the position of original zeros in the matrix
        for(int i = 0;i < rows;i++) {
            for(int j = 0; j < cols;j++) {
                if(matrix[i][j] == 0) {
                    arr[i][j] = true;
                }
            }
        }

        // Second pass : Set correspoding rows and columns to zero
        for(int i = 0;i < rows;i++) {
            for(int j = 0; j < cols;j++) {
                if(arr[i][j] == true) {
                    //Set entire row to zero
                    for(int c = 0; c < cols;c++) {
                        matrix[i][c] = 0;
                    }

                    //set entire column to zero
                    for(int r = 0;r < rows;r++) {
                        matrix[r][j] = 0;
                    }
                }
            }
        }
    }
}

