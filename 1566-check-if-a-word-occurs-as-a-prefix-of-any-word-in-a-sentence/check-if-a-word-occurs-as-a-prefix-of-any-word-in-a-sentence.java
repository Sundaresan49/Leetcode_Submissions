class Solution {
    public boolean check(String s,String t){
        if(s.length()<t.length()){
            return false;
        }
        for(int i=1;i<t.length();i++){
            char curr1=s.charAt(i);
            char curr2=t.charAt(i);
            if(curr1!=curr2){
                return false;
            }
        }
        return true;
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        char p=searchWord.charAt(0);
        String[] arr=sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(0)==p){
                if(check(arr[i],searchWord)){
                    return i+1;
                }
            }
        }
        return -1;
    }
}