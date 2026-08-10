class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int l=m-1;
     int r=n-1;
     int w=nums1.length-1;
     while(l>=0 && r>=0){
        if(nums1[l]>nums2[r]){
            nums1[w]=nums1[l];
            nums1[l]=nums2[r];
            l--;
        }
        else{
            nums1[w]=nums2[r];
            r--;

        }
        w--;
     }
     while(r>=0){
        nums1[w]=nums2[r];
        w--;
        r--;//334683
     }   
    }
}