class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
         int ind=0;
        int grt=0;
        for(int i=0;i<ans.length;i++){
            if(i>=nums.length){
                ans[i]=nums[grt];
                grt++;
            }
            else{
                ans[i]=nums[ind];
                ind++;
            }

        }
        return ans;
    }
}