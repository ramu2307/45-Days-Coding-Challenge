//Method - 1 : [Brute Force Solution]

//Time Complexity : O(nlogn) - [Accepted]
//Space Complexity : O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = m;i < nums1.length;i++) {
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    }
}

//Method - 2 : [Optimized Solution]

//Time Complexity : O(m + n) - [Accepted]
//Space Complexity : O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        int len1 = nums1.length;
        int end_idx = len1 - 1;
        while(n > 0 && m > 0) {
            if(nums2[n-1] >= nums1[m-1]) {
                nums1[end_idx] = nums2[n-1];
                n--;
            }
            else {
                nums1[end_idx] = nums1[m-1];
                m--;
            }
            end_idx--;
        }
        while(n > 0) {
            nums1[end_idx] = nums2[n-1];
            n--;
            end_idx--;
        }
    }
}

