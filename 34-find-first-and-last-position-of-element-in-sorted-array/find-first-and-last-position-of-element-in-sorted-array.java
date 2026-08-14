class Solution {
    public int[] searchRange(int[] nums, int target) {
       int low=0;
       int n=nums.length;
       int high=n-1;
       int l=-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==target){
            l=mid;
            high=mid-1;
        }
        else if(nums[mid]>target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       low=0;
       high=n-1;
       int h=-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==target){
            h=mid;
            low=mid+1;
        }
        else if(nums[mid]>target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       int[] ans={l,h};
       return ans; 
    }
}