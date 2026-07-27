class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int k=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
           if(num%2!=0 || num==1){
            k++;
            if(k==3){
            return true;
           }
           }
           
           else{
            k=0;
           } 
        }
        return false;
    }
}