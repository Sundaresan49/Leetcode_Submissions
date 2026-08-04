class Solution {
    public List<Integer> rowg(int row){
        int ans=1;
        List<Integer> rowfn=new ArrayList<>();
        rowfn.add(1);
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            rowfn.add(ans);
        }
        return rowfn;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer>temp=rowg(i);
            ans.add(temp);
        }
        return ans;
    }
}