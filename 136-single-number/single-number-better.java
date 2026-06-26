class Solution {
    public int singleNumber(int[] nums) {
        int maxi=nums[0];
        int mini=nums[0];
            for(int i=0;i<nums.length;i++){
                maxi=Math.max(maxi,nums[i]);
                mini=Math.min(mini,nums[i]);
            }
        int[] hash=new int[maxi-mini+1];
        int n=0;
        for(int i=0;i<nums.length;i++){
            n=nums[i];
            hash[n-mini]++;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==1){
                return i+mini;
            }
        }
        return 0;
        }
    }
