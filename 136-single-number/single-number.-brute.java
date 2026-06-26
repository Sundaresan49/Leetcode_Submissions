class Solution {
    public int singleNumber(int[] nums) {
      int cnt=0;
      int num=0;
      for(int i=0;i<nums.length;i++){
        num=nums[i];
        for(int j=0;j<nums.length;j++){
            if(nums[j]==num){
                cnt++;
            }
        }
        if(cnt==1){
            return num;
        }
        else{
            cnt=0;
        }
      } 
      return 0; 
    }
}
