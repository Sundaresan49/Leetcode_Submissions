class Solution {
    public int helper(String s){
        String[] o=s.split(" ");
        return o.length;
    }
    public int mostWordsFound(String[] sentences) {
        int maxi=0;
        for(String i:sentences){
            int v=helper(i);
            maxi=Math.max(maxi,v);
        }
        return maxi;
    }
}