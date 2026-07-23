class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            cnt+=nums[i];
            sum=Math.max(cnt,sum);
            if(cnt<0){
                cnt=0;
            }

        }
        return sum;
    }
}