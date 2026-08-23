class Solution {
    public int ceil(int[] arr,int div){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int curr=(int)((long)arr[i]+div-1)/div;
            ans+=curr;
        }
        return ans;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int l=1;
        int h=max;
        int ans=0;
        while(l<=h){
            int m=(l+h)/2;
            int val=ceil(nums,m);
            if(val<=threshold){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}