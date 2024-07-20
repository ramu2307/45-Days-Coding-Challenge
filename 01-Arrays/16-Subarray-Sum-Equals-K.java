//Method - 1 : [Brute Force Solution]

//Time Complexity : O(N*N) - [Accepted]
//Space Complexity : O(1)

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i < nums.length;i++) {
            int sum = 0;
            for(int j = i;j < nums.length;j++) {
                sum = sum + nums[j];
                if(sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}

//Method - 2 : [Optimized Solution]

//Time Complexity : O(N) - [Accepted]
//Space Complexity : O(N)

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int num : nums) {
            sum += num;
            if(map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

