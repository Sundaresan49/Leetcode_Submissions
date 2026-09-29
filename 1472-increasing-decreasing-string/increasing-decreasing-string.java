class Solution {
    public String asc(int[] arr,String r){
        if(isempty(arr)){
            return r;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                r=r+(char)(i+'a');
                arr[i]--;
            }
        }
        return dsc(arr,r);
    }
    public String dsc(int[] arr,String r){
        if(isempty(arr)){
            return r;
        }
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=0){
                r=r+(char)(i+'a');
                arr[i]--;
            }
        }
        return asc(arr,r);
    }
    public boolean isempty(int[] arr){
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }

    public String sortString(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            freq[curr-'a']++;
        }
        String result="";
         result=asc(freq,result);
         return result;
    }
}