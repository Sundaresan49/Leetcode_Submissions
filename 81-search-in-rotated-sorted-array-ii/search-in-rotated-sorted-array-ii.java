class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
       int low=0;
       int high=n-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==target) return true;
         if(nums[mid]==nums[high]&& nums[low]==nums[mid]){
            low++;
            high--;
            continue;
        }
         if(nums[low]<=nums[mid]){
            if(nums[low]<=target && nums[mid]>=target){
                if(nums[mid]==target) return true;
                if(nums[low]==target) return true;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
       
        else {
            if(nums[mid]<=target && target<=nums[high]){
                  if(nums[mid]==target) return true;
                if(nums[high]==target) return true;
                low=mid+1;
            }
            else{
                high=mid-1;
            } 
            }
        }
        return false;
       }
    }
