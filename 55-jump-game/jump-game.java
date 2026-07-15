class Solution {
    public boolean canJump(int[] nums) {
    boolean jump=true;
    int N=nums.length;
    int jr=0;
    
    for(int i=0;i<N;i++){
        if(jr<0){
            jump=false;
        }
        jr=Math.max(jr,nums[i]);
        jr--;

    }
    return jump;        
    }
}