//Method - 1 : [Brute Force Solution]

//Time Complexity : O(N*N) - TLE
//Space Complexity : O(1)

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0;i < height.length;i++) {
            for(int j = i+1;j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j -i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}

//Method - 2 : [Optimized Solution]

//Time Complexity : O(N) - Accepted
//Space Complexity : O(1)

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            int length = Math.min(height[left], height[right]);
            int width = right - left;
            int area = length * width;

            maxArea = Math.max(area,maxArea);

            if(height[right] > height[left]) {
                left++;
            }
            else{
                right--;
            }

        }
        return maxArea;
    }
}

