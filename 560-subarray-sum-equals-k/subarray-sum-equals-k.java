class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt=0;
        int presum=0;
        HashMap<Integer,Integer> precnt=new HashMap<>();
        precnt.put(0,1);
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
            int remove=presum-k;
            if(precnt.containsKey(remove)){
                cnt+=precnt.get(remove);
            }
            precnt.put(presum,precnt.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}