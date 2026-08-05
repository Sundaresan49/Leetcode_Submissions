class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 &&nums[i-1]==nums[i]){
                continue;
            }
            else{
                int j=i+1;
                int k=n-1;
                while(j<k){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum>0){
                        k--;
                    }
                    else if(sum<0){
                        j++;
                    }
                    else{
                        List<Integer> temp=List.of(nums[i],nums[j],nums[k]);
                        ans.add(temp);
                        k--;
                        j++;
                        while(nums[k+1]==nums[k] && j<k) k--;
                        while(nums[j-1]==nums[j] && j<k) j++;
                    }
                }
            }
        }
        return ans;
    }
}