//Time Complexity : O(NlogN) + O(N) + O(N)
//Space Complexity : o(N)

class Solution {

    int merge(int[] nums, int low, int mid, int high) {
        int cnt = 0;
        int j = mid+1;
        for(int i = low;i<=mid;i++) {
            while(j <=high && nums[i] > (2L * (long) nums[j])) {
                j++;
            }
            cnt += (j - mid - 1);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left<=mid && right <=high) {
            if(nums[left] <= nums[right]) {
                arr.add(nums[left]);
                left++;
            }
            else{
                arr.add(nums[right]);
                right++;
            }
        }
        while(left<=mid) {
            arr.add(nums[left]);
            left++;
        }
        while(right<=high) {
            arr.add(nums[right]);
            right++;
        }
        for(int i = low;i<=high;i++){
            nums[i] = arr.get(i-low);
        }
        return cnt;
    }
    int mergeSort(int[] nums, int low, int high) {
        if(low>=high) return 0;
        int mid = (high + low)/2;
        int cnt = mergeSort(nums, low, mid);
        cnt += mergeSort(nums, mid+1, high);
        cnt += merge(nums, low, mid, high);
        return cnt;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}

