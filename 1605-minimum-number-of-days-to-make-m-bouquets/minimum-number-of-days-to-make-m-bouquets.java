class Solution {
    public int possible(int[] arr,int day,int m,int k){
        int cnt=0;
        int no=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                cnt++;
            }
            else{
                no+=(cnt/k);
                cnt=0;
            }
    }
            no+=(cnt/k);
            return no;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        } 
        int l=min;
        int h=max;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int mid=(l+h)/2;
            int val=possible(bloomDay,mid,m,k);
            if(val>=m){
                ans=Math.min(mid,ans);
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}