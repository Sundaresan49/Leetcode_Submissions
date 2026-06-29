class Solution {
    public int subarraySum(int[] nums, int k) {
      int len=0;
      int cnt=0;
      for(int i=0;i<nums.length;i++){
        int s=0;
        for(int j=i;j<nums.length;j++){
            s+=nums[j];
            if(s==k){
                len=Math.max(len,j-i+1);  
                cnt++;
                          }
        }
      } 
      return cnt; 
    }
}