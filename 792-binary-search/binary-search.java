class Solution {
    public int binary(int[] nums, int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            return binary(nums,target,mid+1,high);
        }
        else{
            return binary(nums,target,low,mid-1);
        }
        
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        return  binary(nums,target,0,n-1);
    }
}