class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            int d = 0;
        for(int j =0;j<n;j++){
            d += matrix[i][j];
        }
            a[i] = d;
        }
        return a;
        
    }
}