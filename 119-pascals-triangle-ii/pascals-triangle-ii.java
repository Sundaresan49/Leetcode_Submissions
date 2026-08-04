class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ansLis=new ArrayList<>();
        long ans=1l;
        ansLis.add(1);
        for(int i=1;i<=rowIndex;i++){
            ans=ans*(rowIndex-i+1);
            ans=ans/i;
            ansLis.add((int)ans);
        }
        return ansLis;    
        }
}