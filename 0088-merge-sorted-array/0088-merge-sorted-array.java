class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[m + n];

        int pointer1 = 0;
        int pointer2 = 0;
        int i = 0;

        while(pointer1 < m && pointer2 < n) {

            if(nums1[pointer1] <= nums2[pointer2]) {
                arr[i++] = nums1[pointer1++];
            } else {
                arr[i++] = nums2[pointer2++];
            }
        }

        while(pointer1 < m) {
            arr[i++] = nums1[pointer1++];
        }

        while(pointer2 < n) {
            arr[i++] = nums2[pointer2++];
        }

        for(int k = 0; k < m + n; k++) {
            nums1[k] = arr[k];
        }
    }
}