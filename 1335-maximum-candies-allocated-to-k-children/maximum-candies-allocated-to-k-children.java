class Solution {
    public long floor(int[] arr,long mid){
        long child=0;
        for(int i=0;i<arr.length;i++){
            child+=(arr[i]/mid);
        }
        return child;
    }
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        int h=max;
        int ans=0;
        while(l<=h){
            long m=(l+h)/2;
            long val=floor(candies,m);
            if(val>=k){
                ans=Math.max(ans,(int)m);
                l=(int)m+1;
            }
            else{
                h=(int)m-1;
            }
        }
        return ans;
    }
}