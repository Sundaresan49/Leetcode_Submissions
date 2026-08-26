class Solution {
    public long find(int[] arr,long n){
        long ans=0;
        for(int i=0;i<arr.length;i++){
        long possible = (long)Math.sqrt((double)n /arr[i]);
        ans+= possible;

        }
        return ans;
    }
    public long repairCars(int[] ranks, int cars) {
        long l=1;
        long h=ranks[0];
        long ans=0;
        for(int i=0;i<ranks.length;i++){
            h=Math.min(h,ranks[i]);
        }
        h=h*cars*cars;
        while(l<=h){
            long m=(l+h)/2;
            long val=find(ranks,m);
            if(val >=cars){
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