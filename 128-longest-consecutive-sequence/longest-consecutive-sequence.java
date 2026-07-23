class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest=1;
        int cnt=1;
        int last_ele=Integer.MIN_VALUE;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]-1==last_ele){
                cnt++;
                last_ele=nums[i];
            }
            else if(nums[i]!=last_ele){
                cnt=1;
                last_ele=nums[i];
            }
            else{
                continue;
            }
            longest=Math.max(cnt,longest);
        }
        return longest;
    }
}