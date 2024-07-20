class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] == 0) {
                zero++;
            }
        }
        int iter = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] != 0) {
                nums[iter] = nums[i];
                iter++;
            }
        }
        for(int i = 0;i < zero;i++) {
            nums[iter] = 0;
            iter++;
        }
    }
}

