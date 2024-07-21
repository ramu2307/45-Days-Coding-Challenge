//Method - 1 :

//Time Complexity : O(N) - [Accepted]
//Space Complexity : O(N)

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int n = nums.length/2;
        int ans = 0;
        for(Map.Entry<Integer, Integer> hm : map.entrySet()) {
            if(hm.getValue() > n) {
                ans = hm.getKey();
            }
        }
        return ans;
    }
}

//Method - 2 : 

//Time Complexity : O(N) - [Accepted]
//Space Complexity : O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 1;
        for(int i = 1;i < nums.length;i++) {
            if(votes == 0) {
                majority = nums[i];
                votes++;
            }
            else if(nums[i] == majority) {
                votes++;
            }
            else {
                votes--;
            }
        }
        return majority;
    }
}

