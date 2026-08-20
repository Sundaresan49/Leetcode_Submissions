class Solution {
    public long find(int arr[],int val){
        long ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=(((long)arr[i]+val-1)/val);
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int l=1;
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
            }

        int h1=max;
        int ans=piles[n-1];
        while(l<=h1){
            int m=(l+h1)/2;
            long curr=find(piles,m);
            if(curr<=h){
                ans=Math.min(m,ans);
                h1=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}