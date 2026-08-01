class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int prev=0;
                for(int j=i+1;j<n;j++){
                    int curr=arr[j];
                    arr[j]=prev;
                    prev=curr;
                }
                i++;
                
            }
        }
    }
}