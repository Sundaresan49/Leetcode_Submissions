class Solution {
    public int heightChecker(int[] heights) {
        int[] expected=heights.clone();
        int cnt=0;
       Arrays.sort(heights);
       int n=heights.length;
       for(int i=0;i<n;i++)
       {
        int l=heights[i];
        int r=expected[i];
        if(l!=r){
            cnt++;   
        }
       }
       return cnt;
    }
}