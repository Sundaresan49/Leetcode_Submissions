class Solution {
    public boolean isSubsequence(String s, String t) {
       int spt=0;
       int tpt=0;
       while(spt<s.length()&&tpt<t.length()){
        if(s.charAt(spt)==t.charAt(tpt)){
            spt++;
            tpt++;
        }
        else{
            tpt++;
        }
       }
       if(spt==s.length()){
        return true;
       }
       return false; 
    }
}