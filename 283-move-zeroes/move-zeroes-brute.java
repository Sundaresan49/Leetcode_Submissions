class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> nonzero=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nonzero.add(nums[i]);
            }        
            }
        for(int i=0;i<nonzero.size();i++){
            nums[i]=nonzero.get(i);
        }

        for(int i=nonzero.size();i<nums.length;i++){
            nums[i]=0;
        }
    }
}
