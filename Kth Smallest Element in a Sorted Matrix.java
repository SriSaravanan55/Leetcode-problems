class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix.length;
        int arr[]=new int[m*n];
        int h=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[h++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
