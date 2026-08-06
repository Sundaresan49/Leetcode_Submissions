class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int r=0;
        int c=0;
        int[][] ans=new int[m][n];
        if(original.length!=m*n){
            return new int[0][0];
        }
        for(int i=0;i<original.length;i++){
            r=i/n;
            c=i%n;
            ans[r][c]=original[i];
        }
        return ans;
    }
}