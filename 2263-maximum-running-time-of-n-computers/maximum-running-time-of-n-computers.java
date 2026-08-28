class Solution {
    public long capacity(int[] arr,long m){
        long ans=0;
        for(int battery:arr){
            if(battery>=m){
                ans+=m;
            }
            else{
                ans+=battery;
            }
        }
        return ans;
    }
    public long maxRunTime(int n, int[] batteries) {
        long l=1;
        long h=0;
        for(int i:batteries){
            h+=i;
        }
        long ans=0;
        while(l<=h){
            long m=(l+h)/2;
            long n1=m*n;
            long val=capacity(batteries,m);
            if(val>=n1){
                ans=m;
                l=m+1;    
            }
            else{
                h=m-1;
            }
        }
        return ans;
    }
}