class Solution {
    public int Distribute(int[] arr,int n){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int curr=(arr[i]+n-1)/n;
            ans+=curr;
            }
            return ans;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int max=0;
        for(int i=0;i<quantities.length;i++){
            max=Math.max(quantities[i],max);
        }
        int l=1;
        int h=max;
        int ans=0;
        while(l<=h){
            int m=(l+h)/2;
            int val=Distribute(quantities,m);
            if(val<=n){
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