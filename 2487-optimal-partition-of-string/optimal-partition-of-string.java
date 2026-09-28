class Solution {
    public String part(String s,char c){
        String ans="";
        if(s.length()==0){
            return ans+c;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return ""+c;
            }
            else{
                ans+=s.charAt(i);
            }
        }
        return ans+c;
    }
    public int partitionString(String s) {
        int cnt=1;
        String a="";
        for(int i=0;i<s.length();i++){
            a=part(a,s.charAt(i));
            if(a.length()==1 && i!=0){
                cnt++;
            }
        }
        return cnt;
    }
}