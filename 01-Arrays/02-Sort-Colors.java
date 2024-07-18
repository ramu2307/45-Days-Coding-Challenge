class Solution {
    public void sortColors(int[] nums) {
        int zeroCnt = 0;
        int oneCnt = 0;
        int twoCnt = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] == 0) {
                zeroCnt++;
            }
            else if(nums[i] == 1) {
                oneCnt++;
            }
            else{
                twoCnt++;
            }
        }

        int iter = 0;
        for(int i = 0;i < zeroCnt;i++) {
            nums[iter] = 0;
            iter++;
        }
        for(int i = 0;i < oneCnt;i++) {
            nums[iter] = 1;
            iter++;
        }
        for(int i = 0;i < twoCnt;i++) {
            nums[iter] = 2;
            iter++;
        }
    }
}

