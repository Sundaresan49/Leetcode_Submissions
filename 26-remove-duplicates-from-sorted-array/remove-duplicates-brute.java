class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> uniq=new LinkedHashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            uniq.add(nums[i]);
        }
        int i=0;
        for(int iter:uniq){

            nums[i]=iter;
            i++;
        }
        return uniq.size();
    }
}
