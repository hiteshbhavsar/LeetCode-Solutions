class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        /*
        Runtime: 1 ms, faster than 91.98% of Java online submissions for Set Matrix Zeroes.
Memory Usage: 40.7 MB, less than 26.79% of Java online submissions for Set Matrix Zeroes.
        */
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        for (int i = 0; i < rows.length; i++)
            for (int j = 0; j < cols.length; j++)
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }

        // Update matrix
        for (int i = 0; i < rows.length; i++)
            for (int j = 0; j < cols.length; j++)
                if (rows[i] || cols[j])
                    matrix[i][j] = 0;
        
    }
}
