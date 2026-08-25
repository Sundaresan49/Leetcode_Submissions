class Solution {
    public int sumarr(int[] arr,int n){
        int ans=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+sum<=n){
                sum+=arr[i];
            }
            else{
                ans++;
                sum=0;
                sum+=arr[i];
            }
        }
        return ans;
    }
    public int splitArray(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(nums[i],max);
        }
        int l=max;
        int h=sum;
        int ans=0;
        while(l<=h){
            int m=(l+h)/2;
            int val=sumarr(nums,m);
            if(val<=k){
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