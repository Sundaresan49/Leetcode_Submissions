class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> dplaces=new ArrayList<>();
        int n=nums.length;
        k=k%n;
        for(int i=+(n-k);i<n;i++){
            dplaces.add(nums[i]);
        }
        for(int i=n-1;i>=k;i--){
            nums[i]=nums[i-k];
        }
        for(int i=0;i<k;i++){
            nums[i]=dplaces.get(i);
        }
    
    }
}