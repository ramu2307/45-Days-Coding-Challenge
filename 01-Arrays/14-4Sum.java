//Method - 1 : [Brute Force Solution]

//Time Complexity : O(N*N*N*N) - [TLE]

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length < 4) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i = 0;i < nums.length - 3;i++) {
            for(int j = i+1;j < nums.length - 2;j++) {
                for(int k = j+1;k < nums.length - 1;k++) {
                    for(int l = k+1;l < nums.length;l++) {
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        }
                    }
                }
            }
        }
        return new ArrayList(result);
    }
}

//Method - 2 : [Optimized Solution]

//Time Complexity : O(N*N*N) - [Accepted]

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums == null || nums.length < 4) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i = 0;i < nums.length - 3;i++) {
            for(int j = i+1; j < nums.length - 2;j++) {
                int left = j+1;
                int right = nums.length - 1;
                while(left < right) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];
                    if(sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    }
                    else if(sum < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
            
        }
        return new ArrayList<>(result);
    }
}

