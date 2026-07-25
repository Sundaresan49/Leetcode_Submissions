class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        else if(t.isEmpty()){
            return false;
        }
        int j=0;
        boolean istrue=false;
        for(int i=0;i<s.length();i++){
            istrue=false;
            char u=s.charAt(i);
            while(j<t.length()){
                char v=t.charAt(j);
                if(u!=v){
                    istrue=false;
                    j++;
                }
                else{
                    istrue=true;
                    j=j+1;
                    break;
                }
            }
            if(istrue==false){
               return istrue; 
            }
        }
        return istrue;
    }
}