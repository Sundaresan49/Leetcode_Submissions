class Solution {
    public int sip(int[] nums,int low,int high,int target){
        int ans=nums.length;
        if(low>high){
            return ans;
        }
        int mid=(low+high)/2;
        if(nums[mid]>=target){
            ans=Math.min(ans,mid);
            ans=Math.min(ans,sip(nums,low,mid-1,target));
        }
        else{
            ans=Math.min(ans,sip(nums,mid+1,high,target));
        }
        return ans;
    }
    public int searchInsert(int[] nums, int target) {
        int high=nums.length-1;
        return sip(nums,0,high,target);
    }
}