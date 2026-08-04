class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int siz=n/3;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i:hash.keySet()){
            int curr=hash.get(i);
            if(curr>siz){
                ans.add(i);
            }
        }
        return ans;
    }
}