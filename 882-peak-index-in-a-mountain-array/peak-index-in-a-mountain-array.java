class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int peak=-1;
       int ind=0;
       for(int i=0;i<arr.length;i++){
         if(arr[i]> peak){
            peak=arr[i];
            ind=i;
         }
    }
    return ind;
}
}