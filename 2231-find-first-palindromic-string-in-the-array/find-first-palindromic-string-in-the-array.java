class Solution {
    public boolean reverse(String s){
        int n=s.length();
        int r=n-1;
        int l=0;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
            }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            boolean j=reverse(words[i]);
            if(j){
                return words[i];
            }
        }
        return "";
    }
}