class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++){
        hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
       }
       int max=0;
       int frq=0;
       for(int i:hash.keySet()){
        int n=hash.get(i);
        if(n>frq){
            max=i;
            frq=n;
        }
       }
       
       return max; 
    }
}