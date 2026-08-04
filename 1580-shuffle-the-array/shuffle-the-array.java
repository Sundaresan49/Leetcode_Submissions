class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans=new int[2*n];
        ans[0]=nums[0];
        for(int i=1;i<ans.length;i++){
            ans[i++]=nums[n++];
        }
        int curr=1;
        for(int i=2;i<ans.length && curr<n;i++){
            ans[i++]=nums[curr++];
            
        }
        return ans;
    }
}