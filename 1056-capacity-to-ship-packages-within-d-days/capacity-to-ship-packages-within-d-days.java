class Solution {
    public int howmany(int[] arr,int day){
        int ans=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>day){
                ans++;
                sum=0;
                sum+=arr[i];
            }
           else{ sum+=arr[i];}
        }
        return ans;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            max=Math.max(weights[i],max);
            sum+=weights[i];
        }
        int ans=0;
        int l=max;
        int h=sum;
        while(l<=h){
            int m=(l+h)/2;
            int val=howmany(weights,m);
            if(val<=days){
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