class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int diff=0;
        for(int i=0;i<nums.length-1;i++){
            int curr=nums[i+1]-nums[i];
            for(int j=i+2;j<nums.length;j++){
                int inn=nums[j]-nums[j-1];
                if(curr==inn){
                    diff++;
                }
                else{
                    break;
                }
            }
        }
        return diff;
    }
}
