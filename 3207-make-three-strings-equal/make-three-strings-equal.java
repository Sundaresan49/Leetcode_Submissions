class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {

        int l1=s1.length();
        int l2=s2.length();
        int l3=s3.length();
        int min=Math.min(l1,Math.min(l2,l3));
        int ans=(l1-min)+(l2-min)+(l3-min);
        for(int i=0;i<min;i++){
                System.out.println(i);
            if(s1.charAt(i)==s2.charAt(i)&&s2.charAt(i)==s3.charAt(i)){
                continue;
            }
            else{
                if(i==0){
                    return -1;
                }
                else{
                    ans=(l1-i)+(l2-i)+(l3-i);
                    break;
                }
            }
        }
        return ans;
        
}
}